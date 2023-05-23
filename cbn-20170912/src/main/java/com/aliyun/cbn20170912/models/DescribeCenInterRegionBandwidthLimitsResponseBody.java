// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenInterRegionBandwidthLimitsResponseBody extends TeaModel {
    /**
     * <p>The ID of the peer region.</p>
     */
    @NameInMap("CenInterRegionBandwidthLimits")
    public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits cenInterRegionBandwidthLimits;

    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The bandwidth limit of the cross-region connection. Unit: Mbit/s.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of cross-region connections.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenInterRegionBandwidthLimitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenInterRegionBandwidthLimitsResponseBody self = new DescribeCenInterRegionBandwidthLimitsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenInterRegionBandwidthLimitsResponseBody setCenInterRegionBandwidthLimits(DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits cenInterRegionBandwidthLimits) {
        this.cenInterRegionBandwidthLimits = cenInterRegionBandwidthLimits;
        return this;
    }
    public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits getCenInterRegionBandwidthLimits() {
        return this.cenInterRegionBandwidthLimits;
    }

    public DescribeCenInterRegionBandwidthLimitsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeCenInterRegionBandwidthLimitsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit extends TeaModel {
        @NameInMap("BandwidthLimit")
        public Long bandwidthLimit;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        @NameInMap("LocalRegionId")
        public String localRegionId;

        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

        /**
         * <p>Queries the bandwidth limits of cross-region connections.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit self = new DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit();
            return TeaModel.build(map, self);
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setBandwidthLimit(Long bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        public Long getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setLocalRegionId(String localRegionId) {
            this.localRegionId = localRegionId;
            return this;
        }
        public String getLocalRegionId() {
            return this.localRegionId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setOppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
