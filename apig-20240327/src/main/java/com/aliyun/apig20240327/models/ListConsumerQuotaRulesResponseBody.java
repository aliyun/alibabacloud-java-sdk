// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerQuotaRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;totalSize&quot;:100}</p>
     */
    @NameInMap("data")
    public ListConsumerQuotaRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListConsumerQuotaRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerQuotaRulesResponseBody self = new ListConsumerQuotaRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumerQuotaRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumerQuotaRulesResponseBody setData(ListConsumerQuotaRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConsumerQuotaRulesResponseBodyData getData() {
        return this.data;
    }

    public ListConsumerQuotaRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumerQuotaRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConsumerQuotaRulesResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>prod-gateway</p>
         */
        @NameInMap("gatewayName")
        public String gatewayName;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("periodMultiplier")
        public String periodMultiplier;

        /**
         * <strong>example:</strong>
         * <p>week</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("quotaDimension")
        public String quotaDimension;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("quotaLimit")
        public Long quotaLimit;

        /**
         * <strong>example:</strong>
         * <p>qr-d8j7fpmm1hksxxxxxx</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>daily-token-limit</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <strong>example:</strong>
         * <p>calendar</p>
         */
        @NameInMap("windowAlignment")
        public String windowAlignment;

        public static ListConsumerQuotaRulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerQuotaRulesResponseBodyDataItems self = new ListConsumerQuotaRulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setPeriodMultiplier(String periodMultiplier) {
            this.periodMultiplier = periodMultiplier;
            return this;
        }
        public String getPeriodMultiplier() {
            return this.periodMultiplier;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setQuotaDimension(String quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setQuotaLimit(Long quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Long getQuotaLimit() {
            return this.quotaLimit;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListConsumerQuotaRulesResponseBodyDataItems setWindowAlignment(String windowAlignment) {
            this.windowAlignment = windowAlignment;
            return this;
        }
        public String getWindowAlignment() {
            return this.windowAlignment;
        }

    }

    public static class ListConsumerQuotaRulesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{&quot;ruleId&quot;:&quot;rule-001&quot;}]</p>
         */
        @NameInMap("items")
        public java.util.List<ListConsumerQuotaRulesResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListConsumerQuotaRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerQuotaRulesResponseBodyData self = new ListConsumerQuotaRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumerQuotaRulesResponseBodyData setItems(java.util.List<ListConsumerQuotaRulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListConsumerQuotaRulesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListConsumerQuotaRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConsumerQuotaRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConsumerQuotaRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
