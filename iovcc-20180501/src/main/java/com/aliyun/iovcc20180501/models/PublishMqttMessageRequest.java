// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishMqttMessageRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Message")
    public String message;

    @NameInMap("QoS")
    public Integer qoS;

    public static PublishMqttMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishMqttMessageRequest self = new PublishMqttMessageRequest();
        return TeaModel.build(map, self);
    }

    public PublishMqttMessageRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public PublishMqttMessageRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public PublishMqttMessageRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PublishMqttMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublishMqttMessageRequest setQoS(Integer qoS) {
        this.qoS = qoS;
        return this;
    }
    public Integer getQoS() {
        return this.qoS;
    }

}
