// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListEventRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListEventRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>06273500-249F-5863-121D-74D51123E62C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEventRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventRulesResponseBody self = new ListEventRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventRulesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListEventRulesResponseBody setData(ListEventRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEventRulesResponseBodyData getData() {
        return this.data;
    }

    public ListEventRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventRulesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEventRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEventRulesResponseBodyDataPageDataEndpoint extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>topic</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <strong>example:</strong>
         * <p>test-topic</p>
         */
        @NameInMap("EndpointValue")
        public String endpointValue;

        public static ListEventRulesResponseBodyDataPageDataEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDataPageDataEndpoint self = new ListEventRulesResponseBodyDataPageDataEndpoint();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDataPageDataEndpoint setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListEventRulesResponseBodyDataPageDataEndpoint setEndpointValue(String endpointValue) {
            this.endpointValue = endpointValue;
            return this;
        }
        public String getEndpointValue() {
            return this.endpointValue;
        }

    }

    public static class ListEventRulesResponseBodyDataPageDataSubscriptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>queue</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <strong>example:</strong>
         * <p>wyx-vp-complete-queue</p>
         */
        @NameInMap("EndpointValue")
        public String endpointValue;

        public static ListEventRulesResponseBodyDataPageDataSubscriptions build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDataPageDataSubscriptions self = new ListEventRulesResponseBodyDataPageDataSubscriptions();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDataPageDataSubscriptions setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListEventRulesResponseBodyDataPageDataSubscriptions setEndpointValue(String endpointValue) {
            this.endpointValue = endpointValue;
            return this;
        }
        public String getEndpointValue() {
            return this.endpointValue;
        }

    }

    public static class ListEventRulesResponseBodyDataPageData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>--</p>
         */
        @NameInMap("DeliveryMode")
        public String deliveryMode;

        @NameInMap("Endpoint")
        public ListEventRulesResponseBodyDataPageDataEndpoint endpoint;

        @NameInMap("EventTypes")
        public java.util.List<String> eventTypes;

        @NameInMap("MatchRules")
        public java.util.List<java.util.List<EventMatchRule>> matchRules;

        /**
         * <strong>example:</strong>
         * <p>rule-xsXDW</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Subscriptions")
        public java.util.List<ListEventRulesResponseBodyDataPageDataSubscriptions> subscriptions;

        /**
         * <strong>example:</strong>
         * <p>demo-topic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        public static ListEventRulesResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyDataPageData self = new ListEventRulesResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyDataPageData setDeliveryMode(String deliveryMode) {
            this.deliveryMode = deliveryMode;
            return this;
        }
        public String getDeliveryMode() {
            return this.deliveryMode;
        }

        public ListEventRulesResponseBodyDataPageData setEndpoint(ListEventRulesResponseBodyDataPageDataEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public ListEventRulesResponseBodyDataPageDataEndpoint getEndpoint() {
            return this.endpoint;
        }

        public ListEventRulesResponseBodyDataPageData setEventTypes(java.util.List<String> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public java.util.List<String> getEventTypes() {
            return this.eventTypes;
        }

        public ListEventRulesResponseBodyDataPageData setMatchRules(java.util.List<java.util.List<EventMatchRule>> matchRules) {
            this.matchRules = matchRules;
            return this;
        }
        public java.util.List<java.util.List<EventMatchRule>> getMatchRules() {
            return this.matchRules;
        }

        public ListEventRulesResponseBodyDataPageData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListEventRulesResponseBodyDataPageData setSubscriptions(java.util.List<ListEventRulesResponseBodyDataPageDataSubscriptions> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public java.util.List<ListEventRulesResponseBodyDataPageDataSubscriptions> getSubscriptions() {
            return this.subscriptions;
        }

        public ListEventRulesResponseBodyDataPageData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class ListEventRulesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>a88f58d504b8b4c4e0b5e8707e68181f</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("PageData")
        public java.util.List<ListEventRulesResponseBodyDataPageData> pageData;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Pages")
        public Long pages;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListEventRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEventRulesResponseBodyData self = new ListEventRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEventRulesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListEventRulesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListEventRulesResponseBodyData setPageData(java.util.List<ListEventRulesResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListEventRulesResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListEventRulesResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListEventRulesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListEventRulesResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public ListEventRulesResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListEventRulesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
