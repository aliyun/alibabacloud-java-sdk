// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribePriceResponsePriceInfo priceInfo;

    public static DescribePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponse self = new DescribePriceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribePriceResponsePriceInfoRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribePriceResponsePriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoRulesRule self = new DescribePriceResponsePriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoRulesRule> rule;

        public static DescribePriceResponsePriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoRules self = new DescribePriceResponsePriceInfoRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule self = new DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule;

        public static DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules self = new DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel extends TeaModel {
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

        @NameInMap("SubRules")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules subRules;

        public static DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel self = new DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("ResourcePriceModel")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel;

        public static DescribePriceResponsePriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPriceDetailInfos self = new DescribePriceResponsePriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoPrice extends TeaModel {
        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Double originalPrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Double discountPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Double tradePrice;

        @NameInMap("ReservedInstanceHourPrice")
        @Validation(required = true)
        public Double reservedInstanceHourPrice;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("DetailInfos")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoPriceDetailInfos detailInfos;

        public static DescribePriceResponsePriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPrice self = new DescribePriceResponsePriceInfoPrice();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfo extends TeaModel {
        @NameInMap("Rules")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoRules rules;

        @NameInMap("Price")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoPrice price;

        public static DescribePriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfo self = new DescribePriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

    }

}
