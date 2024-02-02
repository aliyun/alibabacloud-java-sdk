// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthLimitationResponseBody extends TeaModel {
    /**
     * <p>Details about the maximum public bandwidth.</p>
     */
    @NameInMap("Bandwidths")
    public DescribeBandwidthLimitationResponseBodyBandwidths bandwidths;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBandwidthLimitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthLimitationResponseBody self = new DescribeBandwidthLimitationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthLimitationResponseBody setBandwidths(DescribeBandwidthLimitationResponseBodyBandwidths bandwidths) {
        this.bandwidths = bandwidths;
        return this;
    }
    public DescribeBandwidthLimitationResponseBodyBandwidths getBandwidths() {
        return this.bandwidths;
    }

    public DescribeBandwidthLimitationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth extends TeaModel {
        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <br>
         * <p>*   PayByBandwidth: pay-by-bandwidth</p>
         * <p>*   PayByTraffic: pay-by-traffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum public bandwidth.</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum public bandwidth.</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The unit of the public bandwidth.</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth self = new DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeBandwidthLimitationResponseBodyBandwidths extends TeaModel {
        @NameInMap("Bandwidth")
        public java.util.List<DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth> bandwidth;

        public static DescribeBandwidthLimitationResponseBodyBandwidths build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthLimitationResponseBodyBandwidths self = new DescribeBandwidthLimitationResponseBodyBandwidths();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthLimitationResponseBodyBandwidths setBandwidth(java.util.List<DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth> bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public java.util.List<DescribeBandwidthLimitationResponseBodyBandwidthsBandwidth> getBandwidth() {
            return this.bandwidth;
        }

    }

}
