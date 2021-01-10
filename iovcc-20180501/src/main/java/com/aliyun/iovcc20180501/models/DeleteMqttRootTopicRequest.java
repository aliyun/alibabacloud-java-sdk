// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteMqttRootTopicRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("RootTopic")
    public String rootTopic;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteMqttRootTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqttRootTopicRequest self = new DeleteMqttRootTopicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMqttRootTopicRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DeleteMqttRootTopicRequest setRootTopic(String rootTopic) {
        this.rootTopic = rootTopic;
        return this;
    }
    public String getRootTopic() {
        return this.rootTopic;
    }

    public DeleteMqttRootTopicRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
