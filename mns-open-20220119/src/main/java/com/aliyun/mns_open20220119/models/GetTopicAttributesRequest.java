// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetTopicAttributesRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<GetTopicAttributesRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static GetTopicAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTopicAttributesRequest self = new GetTopicAttributesRequest();
        return TeaModel.build(map, self);
    }

    public GetTopicAttributesRequest setTag(java.util.List<GetTopicAttributesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetTopicAttributesRequestTag> getTag() {
        return this.tag;
    }

    public GetTopicAttributesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class GetTopicAttributesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetTopicAttributesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetTopicAttributesRequestTag self = new GetTopicAttributesRequestTag();
            return TeaModel.build(map, self);
        }

        public GetTopicAttributesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTopicAttributesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
