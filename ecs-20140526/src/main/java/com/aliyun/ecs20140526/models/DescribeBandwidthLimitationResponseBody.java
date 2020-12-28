// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthLimitationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Bandwidths")
    public java.util.List<DescribeBandwidthLimitationResponseBodyBandwidths> bandwidths;

    public static DescribeBandwidthLimitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthLimitationResponseBody self = new DescribeBandwidthLimitationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthLimitationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandwidthLimitationResponseBody setBandwidths(java.util.List<DescribeBandwidthLimitationResponseBodyBandwidths> bandwidths) {
        this.bandwidths = bandwidths;
        return this;
    }
    public java.util.List<DescribeBandwidthLimitationResponseBodyBandwidths> getBandwidths() {
        return this.bandwidths;
    }

    public static class DescribeBandwidthLimitationResponseBodyBandwidths extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("Min")
        public Integer min;

        public static DescribeBandwidthLimitationResponseBodyBandwidths build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthLimitationResponseBodyBandwidths self = new DescribeBandwidthLimitationResponseBodyBandwidths();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthLimitationResponseBodyBandwidths setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeBandwidthLimitationResponseBodyBandwidths setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeBandwidthLimitationResponseBodyBandwidths setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeBandwidthLimitationResponseBodyBandwidths setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

    }

}
