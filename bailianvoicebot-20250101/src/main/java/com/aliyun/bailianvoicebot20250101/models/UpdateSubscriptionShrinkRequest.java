// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>rmq-cn-l4p89zajz67.cn-hangzhou.rmq.aliyuncs.com:8080</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("EventSubscriptions")
    public String eventSubscriptionsShrink;

    /**
     * <strong>example:</strong>
     * <p>rmq-cn-l4p89zajz67.cn</p>
     */
    @NameInMap("MqInstanceId")
    public String mqInstanceId;

    /**
     * <strong>example:</strong>
     * <p>ROCKET_MQ_4</p>
     */
    @NameInMap("MqType")
    public String mqType;

    /**
     * <strong>example:</strong>
     * <p>pwd</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("ProducerId")
    public String producerId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateSubscriptionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionShrinkRequest self = new UpdateSubscriptionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateSubscriptionShrinkRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UpdateSubscriptionShrinkRequest setEventSubscriptionsShrink(String eventSubscriptionsShrink) {
        this.eventSubscriptionsShrink = eventSubscriptionsShrink;
        return this;
    }
    public String getEventSubscriptionsShrink() {
        return this.eventSubscriptionsShrink;
    }

    public UpdateSubscriptionShrinkRequest setMqInstanceId(String mqInstanceId) {
        this.mqInstanceId = mqInstanceId;
        return this;
    }
    public String getMqInstanceId() {
        return this.mqInstanceId;
    }

    public UpdateSubscriptionShrinkRequest setMqType(String mqType) {
        this.mqType = mqType;
        return this;
    }
    public String getMqType() {
        return this.mqType;
    }

    public UpdateSubscriptionShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateSubscriptionShrinkRequest setProducerId(String producerId) {
        this.producerId = producerId;
        return this;
    }
    public String getProducerId() {
        return this.producerId;
    }

    public UpdateSubscriptionShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UpdateSubscriptionShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
