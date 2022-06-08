// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class SaveMqConfigRequest extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("MqAccessKey")
    public String mqAccessKey;

    @NameInMap("MqAccessSecret")
    public String mqAccessSecret;

    @NameInMap("MqEndpoint")
    public String mqEndpoint;

    @NameInMap("MqGroupId")
    public String mqGroupId;

    @NameInMap("MqTopic")
    public String mqTopic;

    public static SaveMqConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMqConfigRequest self = new SaveMqConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveMqConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public SaveMqConfigRequest setMqAccessKey(String mqAccessKey) {
        this.mqAccessKey = mqAccessKey;
        return this;
    }
    public String getMqAccessKey() {
        return this.mqAccessKey;
    }

    public SaveMqConfigRequest setMqAccessSecret(String mqAccessSecret) {
        this.mqAccessSecret = mqAccessSecret;
        return this;
    }
    public String getMqAccessSecret() {
        return this.mqAccessSecret;
    }

    public SaveMqConfigRequest setMqEndpoint(String mqEndpoint) {
        this.mqEndpoint = mqEndpoint;
        return this;
    }
    public String getMqEndpoint() {
        return this.mqEndpoint;
    }

    public SaveMqConfigRequest setMqGroupId(String mqGroupId) {
        this.mqGroupId = mqGroupId;
        return this;
    }
    public String getMqGroupId() {
        return this.mqGroupId;
    }

    public SaveMqConfigRequest setMqTopic(String mqTopic) {
        this.mqTopic = mqTopic;
        return this;
    }
    public String getMqTopic() {
        return this.mqTopic;
    }

}
