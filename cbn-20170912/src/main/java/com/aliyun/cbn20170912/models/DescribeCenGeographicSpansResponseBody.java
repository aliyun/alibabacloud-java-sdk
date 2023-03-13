// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenGeographicSpansResponseBody extends TeaModel {
    /**
     * <p>A list of areas.</p>
     */
    @NameInMap("GeographicSpanModels")
    public DescribeCenGeographicSpansResponseBodyGeographicSpanModels geographicSpanModels;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenGeographicSpansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenGeographicSpansResponseBody self = new DescribeCenGeographicSpansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenGeographicSpansResponseBody setGeographicSpanModels(DescribeCenGeographicSpansResponseBodyGeographicSpanModels geographicSpanModels) {
        this.geographicSpanModels = geographicSpanModels;
        return this;
    }
    public DescribeCenGeographicSpansResponseBodyGeographicSpanModels getGeographicSpanModels() {
        return this.geographicSpanModels;
    }

    public DescribeCenGeographicSpansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeCenGeographicSpansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel extends TeaModel {
        /**
         * <p>The ID of the pair of connected areas.</p>
         */
        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        /**
         * <p>The ID of the local area.</p>
         */
        @NameInMap("LocalGeoRegionId")
        public String localGeoRegionId;

        /**
         * <p>The ID of the peer area.</p>
         */
        @NameInMap("OppositeGeoRegionId")
        public String oppositeGeoRegionId;

        public static DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel self = new DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel();
            return TeaModel.build(map, self);
        }

        public DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel setLocalGeoRegionId(String localGeoRegionId) {
            this.localGeoRegionId = localGeoRegionId;
            return this;
        }
        public String getLocalGeoRegionId() {
            return this.localGeoRegionId;
        }

        public DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel setOppositeGeoRegionId(String oppositeGeoRegionId) {
            this.oppositeGeoRegionId = oppositeGeoRegionId;
            return this;
        }
        public String getOppositeGeoRegionId() {
            return this.oppositeGeoRegionId;
        }

    }

    public static class DescribeCenGeographicSpansResponseBodyGeographicSpanModels extends TeaModel {
        @NameInMap("GeographicSpanModel")
        public java.util.List<DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel> geographicSpanModel;

        public static DescribeCenGeographicSpansResponseBodyGeographicSpanModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenGeographicSpansResponseBodyGeographicSpanModels self = new DescribeCenGeographicSpansResponseBodyGeographicSpanModels();
            return TeaModel.build(map, self);
        }

        public DescribeCenGeographicSpansResponseBodyGeographicSpanModels setGeographicSpanModel(java.util.List<DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel> geographicSpanModel) {
            this.geographicSpanModel = geographicSpanModel;
            return this;
        }
        public java.util.List<DescribeCenGeographicSpansResponseBodyGeographicSpanModelsGeographicSpanModel> getGeographicSpanModel() {
            return this.geographicSpanModel;
        }

    }

}
