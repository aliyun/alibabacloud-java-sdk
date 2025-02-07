// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetQueueAttributesRequest extends TeaModel {
    /**
     * <p>The name of the queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-queue</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("Tag")
    public java.util.List<GetQueueAttributesRequestTag> tag;

    public static GetQueueAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueueAttributesRequest self = new GetQueueAttributesRequest();
        return TeaModel.build(map, self);
    }

    public GetQueueAttributesRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public GetQueueAttributesRequest setTag(java.util.List<GetQueueAttributesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetQueueAttributesRequestTag> getTag() {
        return this.tag;
    }

    public static class GetQueueAttributesRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetQueueAttributesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetQueueAttributesRequestTag self = new GetQueueAttributesRequestTag();
            return TeaModel.build(map, self);
        }

        public GetQueueAttributesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetQueueAttributesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
