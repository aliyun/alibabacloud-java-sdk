// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventBusRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eventTest</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdateEventBusRequestTags> tags;

    public static UpdateEventBusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventBusRequest self = new UpdateEventBusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventBusRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEventBusRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public UpdateEventBusRequest setTags(java.util.List<UpdateEventBusRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateEventBusRequestTags> getTags() {
        return this.tags;
    }

    public static class UpdateEventBusRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateEventBusRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventBusRequestTags self = new UpdateEventBusRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateEventBusRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateEventBusRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
