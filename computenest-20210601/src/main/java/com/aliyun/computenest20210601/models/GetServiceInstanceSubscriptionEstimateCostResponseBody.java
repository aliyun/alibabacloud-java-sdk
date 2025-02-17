// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceInstanceSubscriptionEstimateCostResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>464C8CB6-A548-5206-B83C-D32A8E43EC21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of resource price information.</p>
     */
    @NameInMap("ResourcePrices")
    public java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices> resourcePrices;

    public static GetServiceInstanceSubscriptionEstimateCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceSubscriptionEstimateCostResponseBody self = new GetServiceInstanceSubscriptionEstimateCostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceSubscriptionEstimateCostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceInstanceSubscriptionEstimateCostResponseBody setResourcePrices(java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices> resourcePrices) {
        this.resourcePrices = resourcePrices;
        return this;
    }
    public java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices> getResourcePrices() {
        return this.resourcePrices;
    }

    public static class GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos extends TeaModel {
        /**
         * <p>Discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>Original price.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>Pricing module identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>Discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos self = new GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules extends TeaModel {
        /**
         * <p>Promotion description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Promotion name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1021199213</p>
         */
        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules self = new GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices extends TeaModel {
        /**
         * <p>Currency. Valid values:</p>
         * <ul>
         * <li>CNY: Chinese Yuan.</li>
         * <li>USD: US Dollar.</li>
         * <li>JPY: Japanese Yen.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The price details of the pricing module.</p>
         */
        @NameInMap("DetailInfos")
        public java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos> detailInfos;

        /**
         * <p>Discount.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>Original price.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>Renewal duration. The unit is specified by PeriodUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The time unit for the renewal duration, which is the unit of the Period parameter. Valid values: Month, Year. Default value: Month.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>Resource ARN (Aliyun Resource Name).</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:cn-hongkong:1488317743351199:instance/i-j6c6f3lbky38o8rpeqw2</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        /**
         * <p>Promotion details.</p>
         */
        @NameInMap("Rules")
        public java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules> rules;

        /**
         * <p>Discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices self = new GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setDetailInfos(java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos> detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesDetailInfos> getDetailInfos() {
            return this.detailInfos;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setRules(java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePricesRules> getRules() {
            return this.rules;
        }

        public GetServiceInstanceSubscriptionEstimateCostResponseBodyResourcePrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
