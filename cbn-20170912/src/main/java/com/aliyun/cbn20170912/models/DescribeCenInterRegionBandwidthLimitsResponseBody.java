// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenInterRegionBandwidthLimitsResponseBody extends TeaModel {
    @NameInMap("CenInterRegionBandwidthLimits")
    public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimits cenInterRegionBandwidthLimits;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A30C665-8766-5AAA-9274-C97380E2D850</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

        @NameInMap("BandwidthType")
        public String bandwidthType;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        @NameInMap("LocalRegionId")
        public String localRegionId;

        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

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

        public DescribeCenInterRegionBandwidthLimitsResponseBodyCenInterRegionBandwidthLimitsCenInterRegionBandwidthLimit setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
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
