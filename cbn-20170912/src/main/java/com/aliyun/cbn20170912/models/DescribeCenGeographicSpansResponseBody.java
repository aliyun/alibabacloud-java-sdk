// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpansResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("GeographicSpanModels")
    public java.util.List<DescribeCenGeographicSpansResponseBodyGeographicSpanModels> geographicSpanModels;

    public static DescribeCenGeographicSpansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenGeographicSpansResponseBody self = new DescribeCenGeographicSpansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenGeographicSpansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenGeographicSpansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenGeographicSpansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenGeographicSpansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenGeographicSpansResponseBody setGeographicSpanModels(java.util.List<DescribeCenGeographicSpansResponseBodyGeographicSpanModels> geographicSpanModels) {
        this.geographicSpanModels = geographicSpanModels;
        return this;
    }
    public java.util.List<DescribeCenGeographicSpansResponseBodyGeographicSpanModels> getGeographicSpanModels() {
        return this.geographicSpanModels;
    }

    public static class DescribeCenGeographicSpansResponseBodyGeographicSpanModels extends TeaModel {
        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        @NameInMap("OppositeGeoRegionId")
        public String oppositeGeoRegionId;

        @NameInMap("LocalGeoRegionId")
        public String localGeoRegionId;

        public static DescribeCenGeographicSpansResponseBodyGeographicSpanModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenGeographicSpansResponseBodyGeographicSpanModels self = new DescribeCenGeographicSpansResponseBodyGeographicSpanModels();
            return TeaModel.build(map, self);
        }

        public DescribeCenGeographicSpansResponseBodyGeographicSpanModels setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenGeographicSpansResponseBodyGeographicSpanModels setOppositeGeoRegionId(String oppositeGeoRegionId) {
            this.oppositeGeoRegionId = oppositeGeoRegionId;
            return this;
        }
        public String getOppositeGeoRegionId() {
            return this.oppositeGeoRegionId;
        }

        public DescribeCenGeographicSpansResponseBodyGeographicSpanModels setLocalGeoRegionId(String localGeoRegionId) {
            this.localGeoRegionId = localGeoRegionId;
            return this;
        }
        public String getLocalGeoRegionId() {
            return this.localGeoRegionId;
        }

    }

}
