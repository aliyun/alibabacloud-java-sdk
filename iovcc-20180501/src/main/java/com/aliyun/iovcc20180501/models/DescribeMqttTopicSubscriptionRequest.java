// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttTopicSubscriptionRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeMqttTopicSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttTopicSubscriptionRequest self = new DescribeMqttTopicSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMqttTopicSubscriptionRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeMqttTopicSubscriptionRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public DescribeMqttTopicSubscriptionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
