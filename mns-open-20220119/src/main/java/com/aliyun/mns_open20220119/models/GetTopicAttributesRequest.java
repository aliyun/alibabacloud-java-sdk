// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetTopicAttributesRequest extends TeaModel {
    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<GetTopicAttributesRequestTag> tag;

    /**
     * <p>The name of the topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-topic</p>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
