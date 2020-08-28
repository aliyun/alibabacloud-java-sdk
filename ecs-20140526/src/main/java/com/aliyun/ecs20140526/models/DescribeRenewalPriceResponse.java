// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribeRenewalPriceResponsePriceInfo priceInfo;

    public static DescribeRenewalPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceResponse self = new DescribeRenewalPriceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRenewalPriceResponsePriceInfoRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeRenewalPriceResponsePriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoRulesRule self = new DescribeRenewalPriceResponsePriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribeRenewalPriceResponsePriceInfoRulesRule> rule;

        public static DescribeRenewalPriceResponsePriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoRules self = new DescribeRenewalPriceResponsePriceInfoRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule self = new DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule;

        public static DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules self = new DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel extends TeaModel {
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
        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules subRules;

        public static DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel self = new DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("ResourcePriceModel")
        @Validation(required = true)
        public java.util.List<DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel;

        public static DescribeRenewalPriceResponsePriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPriceDetailInfos self = new DescribeRenewalPriceResponsePriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPrice extends TeaModel {
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
        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfos detailInfos;

        public static DescribeRenewalPriceResponsePriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPrice self = new DescribeRenewalPriceResponsePriceInfoPrice();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfo extends TeaModel {
        @NameInMap("Rules")
        @Validation(required = true)
        public DescribeRenewalPriceResponsePriceInfoRules rules;

        @NameInMap("Price")
        @Validation(required = true)
        public DescribeRenewalPriceResponsePriceInfoPrice price;

        public static DescribeRenewalPriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfo self = new DescribeRenewalPriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

    }

}
