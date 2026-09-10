// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionRequest extends TeaModel {
    /**
     * <p>The ID of the Model Studio business space.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <p>The endpoint. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_4</code> or <code>ROCKET_MQ_5</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-l4p89zajz67.cn-hangzhou.rmq.aliyuncs.com:8080</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>A list of events to subscribe to.</p>
     */
    @NameInMap("EventSubscriptions")
    public java.util.List<String> eventSubscriptions;

    /**
     * <p>The ID of the ApsaraMQ for RocketMQ instance. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_5</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-l4p89zajz67.cn</p>
     */
    @NameInMap("MqInstanceId")
    public String mqInstanceId;

    /**
     * <p>The type of the message queue service. Valid values are <code>ROCKET_MQ_4</code> and <code>ROCKET_MQ_5</code>, which correspond to ApsaraMQ for RocketMQ.</p>
     * 
     * <strong>example:</strong>
     * <p>ROCKET_MQ_4</p>
     */
    @NameInMap("MqType")
    public String mqType;

    /**
     * <p>The password for authentication. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_5</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>pwd</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the producer. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_4</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("ProducerId")
    public String producerId;

    /**
     * <p>The topic of the queue. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_4</code> or <code>ROCKET_MQ_5</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The username for authentication. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_5</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionRequest self = new UpdateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateSubscriptionRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UpdateSubscriptionRequest setEventSubscriptions(java.util.List<String> eventSubscriptions) {
        this.eventSubscriptions = eventSubscriptions;
        return this;
    }
    public java.util.List<String> getEventSubscriptions() {
        return this.eventSubscriptions;
    }

    public UpdateSubscriptionRequest setMqInstanceId(String mqInstanceId) {
        this.mqInstanceId = mqInstanceId;
        return this;
    }
    public String getMqInstanceId() {
        return this.mqInstanceId;
    }

    public UpdateSubscriptionRequest setMqType(String mqType) {
        this.mqType = mqType;
        return this;
    }
    public String getMqType() {
        return this.mqType;
    }

    public UpdateSubscriptionRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateSubscriptionRequest setProducerId(String producerId) {
        this.producerId = producerId;
        return this;
    }
    public String getProducerId() {
        return this.producerId;
    }

    public UpdateSubscriptionRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UpdateSubscriptionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
