// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextOffset")
    @Validation(required = true)
    public Integer nextOffset;

    @NameInMap("Currency")
    @Validation(required = true)
    public String currency;

    @NameInMap("SpotPrices")
    @Validation(required = true)
    public DescribeSpotPriceHistoryResponseSpotPrices spotPrices;

    public static DescribeSpotPriceHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotPriceHistoryResponse self = new DescribeSpotPriceHistoryResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("IoOptimized")
        @Validation(required = true)
        public String ioOptimized;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("SpotPrice")
        @Validation(required = true)
        public Double spotPrice;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Double originPrice;

        public static DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType self = new DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSpotPriceHistoryResponseSpotPrices extends TeaModel {
        @NameInMap("SpotPriceType")
        @Validation(required = true)
        public java.util.List<DescribeSpotPriceHistoryResponseSpotPricesSpotPriceType> spotPriceType;

        public static DescribeSpotPriceHistoryResponseSpotPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotPriceHistoryResponseSpotPrices self = new DescribeSpotPriceHistoryResponseSpotPrices();
            return TeaModel.build(map, self);
        }

    }

}
