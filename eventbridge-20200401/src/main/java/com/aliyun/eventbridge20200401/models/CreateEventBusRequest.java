// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventBusRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyEventBus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The ID of the resource group. If you do not specify this parameter, the event bus belongs to the default resource group of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateEventBusRequestTags> tags;

    public static CreateEventBusRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventBusRequest self = new CreateEventBusRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventBusRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEventBusRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public CreateEventBusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEventBusRequest setTags(java.util.List<CreateEventBusRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateEventBusRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateEventBusRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the first tag in the tag list.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEventBusRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateEventBusRequestTags self = new CreateEventBusRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateEventBusRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEventBusRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
