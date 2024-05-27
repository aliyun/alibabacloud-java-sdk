// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    @NameInMap("MaxMessageSize")
    public Long maxMessageSize;

    @NameInMap("Tag")
    public java.util.List<CreateTopicRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     */
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

    public CreateTopicRequest setTag(java.util.List<CreateTopicRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTopicRequestTag> getTag() {
        return this.tag;
    }

    public CreateTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class CreateTopicRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateTopicRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTopicRequestTag self = new CreateTopicRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTopicRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTopicRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
