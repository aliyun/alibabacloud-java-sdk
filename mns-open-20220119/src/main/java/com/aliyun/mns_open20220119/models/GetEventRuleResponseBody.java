// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetEventRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetEventRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static GetEventRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventRuleResponseBody self = new GetEventRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventRuleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetEventRuleResponseBody setData(GetEventRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEventRuleResponseBodyData getData() {
        return this.data;
    }

    public GetEventRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventRuleResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEventRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEventRuleResponseBodyDataEndpoint extends TeaModel {
        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("EndpointValue")
        public String endpointValue;

        public static GetEventRuleResponseBodyDataEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetEventRuleResponseBodyDataEndpoint self = new GetEventRuleResponseBodyDataEndpoint();
            return TeaModel.build(map, self);
        }

        public GetEventRuleResponseBodyDataEndpoint setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public GetEventRuleResponseBodyDataEndpoint setEndpointValue(String endpointValue) {
            this.endpointValue = endpointValue;
            return this;
        }
        public String getEndpointValue() {
            return this.endpointValue;
        }

    }

    public static class GetEventRuleResponseBodyDataSubscriptions extends TeaModel {
        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("EndpointValue")
        public String endpointValue;

        public static GetEventRuleResponseBodyDataSubscriptions build(java.util.Map<String, ?> map) throws Exception {
            GetEventRuleResponseBodyDataSubscriptions self = new GetEventRuleResponseBodyDataSubscriptions();
            return TeaModel.build(map, self);
        }

        public GetEventRuleResponseBodyDataSubscriptions setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public GetEventRuleResponseBodyDataSubscriptions setEndpointValue(String endpointValue) {
            this.endpointValue = endpointValue;
            return this;
        }
        public String getEndpointValue() {
            return this.endpointValue;
        }

    }

    public static class GetEventRuleResponseBodyData extends TeaModel {
        @NameInMap("DeliveryMode")
        public String deliveryMode;

        @NameInMap("Endpoint")
        public GetEventRuleResponseBodyDataEndpoint endpoint;

        @NameInMap("EventTypes")
        public java.util.List<String> eventTypes;

        @NameInMap("MatchRules")
        public java.util.List<java.util.List<EventMatchRule>> matchRules;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Subscriptions")
        public java.util.List<GetEventRuleResponseBodyDataSubscriptions> subscriptions;

        @NameInMap("TopicName")
        public String topicName;

        public static GetEventRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventRuleResponseBodyData self = new GetEventRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventRuleResponseBodyData setDeliveryMode(String deliveryMode) {
            this.deliveryMode = deliveryMode;
            return this;
        }
        public String getDeliveryMode() {
            return this.deliveryMode;
        }

        public GetEventRuleResponseBodyData setEndpoint(GetEventRuleResponseBodyDataEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public GetEventRuleResponseBodyDataEndpoint getEndpoint() {
            return this.endpoint;
        }

        public GetEventRuleResponseBodyData setEventTypes(java.util.List<String> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public java.util.List<String> getEventTypes() {
            return this.eventTypes;
        }

        public GetEventRuleResponseBodyData setMatchRules(java.util.List<java.util.List<EventMatchRule>> matchRules) {
            this.matchRules = matchRules;
            return this;
        }
        public java.util.List<java.util.List<EventMatchRule>> getMatchRules() {
            return this.matchRules;
        }

        public GetEventRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetEventRuleResponseBodyData setSubscriptions(java.util.List<GetEventRuleResponseBodyDataSubscriptions> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public java.util.List<GetEventRuleResponseBodyDataSubscriptions> getSubscriptions() {
            return this.subscriptions;
        }

        public GetEventRuleResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
