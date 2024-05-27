// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetTopicAttributesRequest extends TeaModel {
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    @NameInMap("MaxMessageSize")
    public Long maxMessageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static SetTopicAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTopicAttributesRequest self = new SetTopicAttributesRequest();
        return TeaModel.build(map, self);
    }

    public SetTopicAttributesRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public SetTopicAttributesRequest setMaxMessageSize(Long maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
        return this;
    }
    public Long getMaxMessageSize() {
        return this.maxMessageSize;
    }

    public SetTopicAttributesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
