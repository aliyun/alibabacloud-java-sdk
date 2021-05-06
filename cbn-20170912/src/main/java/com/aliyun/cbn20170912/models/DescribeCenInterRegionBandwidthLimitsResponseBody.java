// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenInterRegionBandwidthLimitsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("CenInterRegionBandwidthLimits")
    public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits cenInterRegionBandwidthLimits;

    public static DescribeCenInterRegionBandwidthLimitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenInterRegionBandwidthLimitsResponseBody self = new DescribeCenInterRegionBandwidthLimitsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenInterRegionBandwidthLimitsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenInterRegionBandwidthLimitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenInterRegionBandwidthLimitsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenInterRegionBandwidthLimitsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenInterRegionBandwidthLimitsResponseBody setCenInterRegionBandwidthLimits(DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits cenInterRegionBandwidthLimits) {
        this.cenInterRegionBandwidthLimits = cenInterRegionBandwidthLimits;
        return this;
    }
    public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits getCenInterRegionBandwidthLimits() {
        return this.cenInterRegionBandwidthLimits;
    }

    public static class DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("LocalRegionId")
        public String localRegionId;

        @NameInMap("BandwidthLimit")
        public Long bandwidthLimit;

        public static DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit self = new DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit();
            return TeaModel.build(map, self);
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setOppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setLocalRegionId(String localRegionId) {
            this.localRegionId = localRegionId;
            return this;
        }
        public String getLocalRegionId() {
            return this.localRegionId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setBandwidthLimit(Long bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        public Long getBandwidthLimit() {
            return this.bandwidthLimit;
        }

    }

    public static class DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits extends TeaModel {
        @NameInMap("CenInterRegionBandwidthLimit")
        public java.util.List<DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit> cenInterRegionBandwidthLimit;

        public static DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits self = new DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits();
            return TeaModel.build(map, self);
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits setCenInterRegionBandwidthLimit(java.util.List<DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit> cenInterRegionBandwidthLimit) {
            this.cenInterRegionBandwidthLimit = cenInterRegionBandwidthLimit;
            return this;
        }
        public java.util.List<DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit> getCenInterRegionBandwidthLimit() {
            return this.cenInterRegionBandwidthLimit;
        }

    }

}
