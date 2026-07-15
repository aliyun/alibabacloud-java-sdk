// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ruleId&quot;:1001}</p>
     */
    @NameInMap("data")
    public GetGatewayQuotaRuleResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayQuotaRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleResponseBody self = new GetGatewayQuotaRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayQuotaRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayQuotaRuleResponseBody setData(GetGatewayQuotaRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayQuotaRuleResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayQuotaRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayQuotaRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayQuotaRuleResponseBodyDataConsumers extends TeaModel {
        /**
         * <p>The ID of the principal (consumer).</p>
         * 
         * <strong>example:</strong>
         * <p>c-aaa</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the principal (consumer).</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("name")
        public String name;

        public static GetGatewayQuotaRuleResponseBodyDataConsumers build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayQuotaRuleResponseBodyDataConsumers self = new GetGatewayQuotaRuleResponseBodyDataConsumers();
            return TeaModel.build(map, self);
        }

        public GetGatewayQuotaRuleResponseBodyDataConsumers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetGatewayQuotaRuleResponseBodyDataConsumers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetGatewayQuotaRuleResponseBodyData extends TeaModel {
        /**
         * <p>The base timestamp of the period.</p>
         * 
         * <strong>example:</strong>
         * <p>1745846400000</p>
         */
        @NameInMap("baseTimestamp")
        public Long baseTimestamp;

        /**
         * <p>The number of consumers associated with the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("consumerCount")
        public Long consumerCount;

        /**
         * <p>The list of principals (consumers) bound to this rule.</p>
         */
        @NameInMap("consumers")
        public java.util.List<GetGatewayQuotaRuleResponseBodyDataConsumers> consumers;

        /**
         * <p>The quota period type.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The quota dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("quotaDimension")
        public String quotaDimension;

        /**
         * <p>The quota limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("quotaLimit")
        public Long quotaLimit;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qr-d8j7fpmm1hks65xxxxxx</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>daily-token-limit</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>The rule status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>The time zone for the calendar period, in UTC+x format.</p>
         * 
         * <strong>example:</strong>
         * <p>GMT+8</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The reset period type.</p>
         * 
         * <strong>example:</strong>
         * <p>calendar</p>
         */
        @NameInMap("windowAlignment")
        public String windowAlignment;

        public static GetGatewayQuotaRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayQuotaRuleResponseBodyData self = new GetGatewayQuotaRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayQuotaRuleResponseBodyData setBaseTimestamp(Long baseTimestamp) {
            this.baseTimestamp = baseTimestamp;
            return this;
        }
        public Long getBaseTimestamp() {
            return this.baseTimestamp;
        }

        public GetGatewayQuotaRuleResponseBodyData setConsumerCount(Long consumerCount) {
            this.consumerCount = consumerCount;
            return this;
        }
        public Long getConsumerCount() {
            return this.consumerCount;
        }

        public GetGatewayQuotaRuleResponseBodyData setConsumers(java.util.List<GetGatewayQuotaRuleResponseBodyDataConsumers> consumers) {
            this.consumers = consumers;
            return this;
        }
        public java.util.List<GetGatewayQuotaRuleResponseBodyDataConsumers> getConsumers() {
            return this.consumers;
        }

        public GetGatewayQuotaRuleResponseBodyData setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public GetGatewayQuotaRuleResponseBodyData setQuotaDimension(String quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        public GetGatewayQuotaRuleResponseBodyData setQuotaLimit(Long quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Long getQuotaLimit() {
            return this.quotaLimit;
        }

        public GetGatewayQuotaRuleResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetGatewayQuotaRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetGatewayQuotaRuleResponseBodyData setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public GetGatewayQuotaRuleResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public GetGatewayQuotaRuleResponseBodyData setWindowAlignment(String windowAlignment) {
            this.windowAlignment = windowAlignment;
            return this;
        }
        public String getWindowAlignment() {
            return this.windowAlignment;
        }

    }

}
