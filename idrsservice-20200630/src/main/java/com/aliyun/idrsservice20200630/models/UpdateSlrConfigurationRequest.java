// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateSlrConfigurationRequest extends TeaModel {
    @NameInMap("MqSubscribe")
    public Boolean mqSubscribe;

    @NameInMap("MqEndpoint")
    public String mqEndpoint;

    @NameInMap("MqInstanceId")
    public String mqInstanceId;

    @NameInMap("MqTopic")
    public String mqTopic;

    @NameInMap("MqGroupId")
    public String mqGroupId;

    @NameInMap("MqEvent")
    public java.util.List<String> mqEvent;

    public static UpdateSlrConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlrConfigurationRequest self = new UpdateSlrConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSlrConfigurationRequest setMqSubscribe(Boolean mqSubscribe) {
        this.mqSubscribe = mqSubscribe;
        return this;
    }
    public Boolean getMqSubscribe() {
        return this.mqSubscribe;
    }

    public UpdateSlrConfigurationRequest setMqEndpoint(String mqEndpoint) {
        this.mqEndpoint = mqEndpoint;
        return this;
    }
    public String getMqEndpoint() {
        return this.mqEndpoint;
    }

    public UpdateSlrConfigurationRequest setMqInstanceId(String mqInstanceId) {
        this.mqInstanceId = mqInstanceId;
        return this;
    }
    public String getMqInstanceId() {
        return this.mqInstanceId;
    }

    public UpdateSlrConfigurationRequest setMqTopic(String mqTopic) {
        this.mqTopic = mqTopic;
        return this;
    }
    public String getMqTopic() {
        return this.mqTopic;
    }

    public UpdateSlrConfigurationRequest setMqGroupId(String mqGroupId) {
        this.mqGroupId = mqGroupId;
        return this;
    }
    public String getMqGroupId() {
        return this.mqGroupId;
    }

    public UpdateSlrConfigurationRequest setMqEvent(java.util.List<String> mqEvent) {
        this.mqEvent = mqEvent;
        return this;
    }
    public java.util.List<String> getMqEvent() {
        return this.mqEvent;
    }

}
