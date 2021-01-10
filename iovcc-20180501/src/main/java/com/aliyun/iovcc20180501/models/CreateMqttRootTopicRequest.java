// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateMqttRootTopicRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("RootTopic")
    public String rootTopic;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateMqttRootTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMqttRootTopicRequest self = new CreateMqttRootTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateMqttRootTopicRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateMqttRootTopicRequest setRootTopic(String rootTopic) {
        this.rootTopic = rootTopic;
        return this;
    }
    public String getRootTopic() {
        return this.rootTopic;
    }

    public CreateMqttRootTopicRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateMqttRootTopicRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
