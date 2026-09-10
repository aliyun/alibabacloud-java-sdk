// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The subscription information.</p>
     */
    @NameInMap("Data")
    public GetSubscriptionResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance llm-zzu528i29ecnprcl does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of dynamic error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D771A1B6-3D5F-174A-BEE1-98CE1000D337</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionResponseBody self = new GetSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionResponseBody setData(GetSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public GetSubscriptionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSubscriptionResponseBodyDataEventList extends TeaModel {
        /**
         * <p>Indicates whether the event is pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The display name of the subscription content.</p>
         * 
         * <strong>example:</strong>
         * <p>Call Ended</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The subscription content.</p>
         * 
         * <strong>example:</strong>
         * <p>Released</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetSubscriptionResponseBodyDataEventList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataEventList self = new GetSubscriptionResponseBodyDataEventList();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataEventList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public GetSubscriptionResponseBodyDataEventList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetSubscriptionResponseBodyDataEventList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSubscriptionResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the subscription is disabled. Valid values:</p>
         * <ul>
         * <li>0: enabled.</li>
         * <li>1: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The endpoint. This parameter is required when MqType is set to ROCKET_MQ_4 or ROCKET_MQ_5.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-l4p89zajz67.cn-hangzhou.rmq.aliyuncs.com:8080</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The list of subscription events.</p>
         */
        @NameInMap("EventList")
        public java.util.List<GetSubscriptionResponseBodyDataEventList> eventList;

        /**
         * <p>The Bailian business workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3pptowd2olrctsvc</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The MQ instance ID. This parameter is required when MqType is set to ROCKET_MQ_5.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-l4p89zajz67.cn</p>
         */
        @NameInMap("MqInstanceId")
        public String mqInstanceId;

        /**
         * <p>The message push type.</p>
         * 
         * <strong>example:</strong>
         * <p>ROCKET_MQ_4</p>
         */
        @NameInMap("MqType")
        public String mqType;

        /**
         * <p>The password. This parameter is required when MqType is set to ROCKET_MQ_5.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The producer ID. This parameter is required when MqType is set to ROCKET_MQ_4.</p>
         * 
         * <strong>example:</strong>
         * <p>PID_Webhook</p>
         */
        @NameInMap("ProducerId")
        public String producerId;

        /**
         * <p>The queue topic. This parameter is required when MqType is set to ROCKET_MQ_4 or ROCKET_MQ_5.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The username. This parameter is required when MqType is set to ROCKET_MQ_5.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyData self = new GetSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyData setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public GetSubscriptionResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetSubscriptionResponseBodyData setEventList(java.util.List<GetSubscriptionResponseBodyDataEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataEventList> getEventList() {
            return this.eventList;
        }

        public GetSubscriptionResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSubscriptionResponseBodyData setMqInstanceId(String mqInstanceId) {
            this.mqInstanceId = mqInstanceId;
            return this;
        }
        public String getMqInstanceId() {
            return this.mqInstanceId;
        }

        public GetSubscriptionResponseBodyData setMqType(String mqType) {
            this.mqType = mqType;
            return this;
        }
        public String getMqType() {
            return this.mqType;
        }

        public GetSubscriptionResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetSubscriptionResponseBodyData setProducerId(String producerId) {
            this.producerId = producerId;
            return this;
        }
        public String getProducerId() {
            return this.producerId;
        }

        public GetSubscriptionResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetSubscriptionResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
