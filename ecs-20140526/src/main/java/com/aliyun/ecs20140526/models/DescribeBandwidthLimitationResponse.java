// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthLimitationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Bandwidths")
    @Validation(required = true)
    public DescribeBandwidthLimitationResponseBandwidths bandwidths;

    public static DescribeBandwidthLimitationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthLimitationResponse self = new DescribeBandwidthLimitationResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeBandwidthLimitationResponseBandwidthsBandwidth extends TeaModel {
        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("Min")
        @Validation(required = true)
        public Integer min;

        @NameInMap("Max")
        @Validation(required = true)
        public Integer max;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        public static DescribeBandwidthLimitationResponseBandwidthsBandwidth build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthLimitationResponseBandwidthsBandwidth self = new DescribeBandwidthLimitationResponseBandwidthsBandwidth();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeBandwidthLimitationResponseBandwidths extends TeaModel {
        @NameInMap("Bandwidth")
        @Validation(required = true)
        public java.util.List<DescribeBandwidthLimitationResponseBandwidthsBandwidth> bandwidth;

        public static DescribeBandwidthLimitationResponseBandwidths build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthLimitationResponseBandwidths self = new DescribeBandwidthLimitationResponseBandwidths();
            return TeaModel.build(map, self);
        }

    }

}
