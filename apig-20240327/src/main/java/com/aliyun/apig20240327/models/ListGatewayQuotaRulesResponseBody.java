// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayQuotaRulesResponseBody extends TeaModel {
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
     * <p>{&quot;totalSize&quot;:100}</p>
     */
    @NameInMap("data")
    public ListGatewayQuotaRulesResponseBodyData data;

    /**
     * <p>The maximum number of records to retrieve in a single request. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>762b1fa4e2434fd3959b1f66481979cf</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayQuotaRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayQuotaRulesResponseBody self = new ListGatewayQuotaRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayQuotaRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewayQuotaRulesResponseBody setData(ListGatewayQuotaRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayQuotaRulesResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayQuotaRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGatewayQuotaRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayQuotaRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGatewayQuotaRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayQuotaRulesResponseBodyDataItems extends TeaModel {
        /**
         * <p>The period type.</p>
         * 
         * <strong>example:</strong>
         * <p>week</p>
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
         * <p>qr-xxxxx</p>
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
         * <p>The reset period type. Only calendar periods are supported, which means windowAlignment=&quot;calendar&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>calendar</p>
         */
        @NameInMap("windowAlignment")
        public String windowAlignment;

        public static ListGatewayQuotaRulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayQuotaRulesResponseBodyDataItems self = new ListGatewayQuotaRulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListGatewayQuotaRulesResponseBodyDataItems setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public ListGatewayQuotaRulesResponseBodyDataItems setQuotaDimension(String quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        public ListGatewayQuotaRulesResponseBodyDataItems setQuotaLimit(Long quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Long getQuotaLimit() {
            return this.quotaLimit;
        }

        public ListGatewayQuotaRulesResponseBodyDataItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListGatewayQuotaRulesResponseBodyDataItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListGatewayQuotaRulesResponseBodyDataItems setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public ListGatewayQuotaRulesResponseBodyDataItems setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListGatewayQuotaRulesResponseBodyDataItems setWindowAlignment(String windowAlignment) {
            this.windowAlignment = windowAlignment;
            return this;
        }
        public String getWindowAlignment() {
            return this.windowAlignment;
        }

    }

    public static class ListGatewayQuotaRulesResponseBodyData extends TeaModel {
        /**
         * <p>The list of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ruleId&quot;:&quot;rule-001&quot;}]</p>
         */
        @NameInMap("items")
        public java.util.List<ListGatewayQuotaRulesResponseBodyDataItems> items;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The current page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListGatewayQuotaRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayQuotaRulesResponseBodyData self = new ListGatewayQuotaRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayQuotaRulesResponseBodyData setItems(java.util.List<ListGatewayQuotaRulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGatewayQuotaRulesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListGatewayQuotaRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayQuotaRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayQuotaRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
