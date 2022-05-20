// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    @NameInMap("MaxMessageSize")
    public Long maxMessageSize;

    @NameInMap("TopicName")
    public String topicName;

    public static CreateTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRequest self = new CreateTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public CreateTopicRequest setMaxMessageSize(Long maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
        return this;
    }
    public Long getMaxMessageSize() {
        return this.maxMessageSize;
    }

    public CreateTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
