// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupPriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribeContainerGroupPriceResponsePriceInfo priceInfo;

    public static DescribeContainerGroupPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupPriceResponse self = new DescribeContainerGroupPriceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeContainerGroupPriceResponsePriceInfoRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeContainerGroupPriceResponsePriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoRulesRule self = new DescribeContainerGroupPriceResponsePriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupPriceResponsePriceInfoRulesRule> rule;

        public static DescribeContainerGroupPriceResponsePriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoRules self = new DescribeContainerGroupPriceResponsePriceInfoRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfoSpotPricesSpotPrice extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("SpotPrice")
        @Validation(required = true)
        public Double spotPrice;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Double originPrice;

        public static DescribeContainerGroupPriceResponsePriceInfoSpotPricesSpotPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoSpotPricesSpotPrice self = new DescribeContainerGroupPriceResponsePriceInfoSpotPricesSpotPrice();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfoSpotPrices extends TeaModel {
        @NameInMap("SpotPrice")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupPriceResponsePriceInfoSpotPricesSpotPrice> spotPrice;

        public static DescribeContainerGroupPriceResponsePriceInfoSpotPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoSpotPrices self = new DescribeContainerGroupPriceResponsePriceInfoSpotPrices();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRulesRule self = new DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRulesRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRulesRule> rule;

        public static DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRules self = new DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfo extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public String resource;

        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Double originalPrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Double discountPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Double tradePrice;

        @NameInMap("Rules")
        @Validation(required = true)
        public DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfoRules rules;

        public static DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfo self = new DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("DetailInfo")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfosDetailInfo> detailInfo;

        public static DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfos self = new DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfoPrice extends TeaModel {
        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Double originalPrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Double discountPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Double tradePrice;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("DetailInfos")
        @Validation(required = true)
        public DescribeContainerGroupPriceResponsePriceInfoPriceDetailInfos detailInfos;

        public static DescribeContainerGroupPriceResponsePriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfoPrice self = new DescribeContainerGroupPriceResponsePriceInfoPrice();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupPriceResponsePriceInfo extends TeaModel {
        @NameInMap("Rules")
        @Validation(required = true)
        public DescribeContainerGroupPriceResponsePriceInfoRules rules;

        @NameInMap("SpotPrices")
        @Validation(required = true)
        public DescribeContainerGroupPriceResponsePriceInfoSpotPrices spotPrices;

        @NameInMap("Price")
        @Validation(required = true)
        public DescribeContainerGroupPriceResponsePriceInfoPrice price;

        public static DescribeContainerGroupPriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponsePriceInfo self = new DescribeContainerGroupPriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

    }

}
