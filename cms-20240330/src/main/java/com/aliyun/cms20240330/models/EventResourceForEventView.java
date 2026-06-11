// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EventResourceForEventView extends TeaModel {
    /**
     * <p>The resource entity.</p>
     */
    @NameInMap("entity")
    public EventResourceForEventViewEntity entity;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;env&quot;: &quot;prod&quot;, &quot;project&quot;: &quot;payment-gateway&quot; }</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, ?> tags;

    public static EventResourceForEventView build(java.util.Map<String, ?> map) throws Exception {
        EventResourceForEventView self = new EventResourceForEventView();
        return TeaModel.build(map, self);
    }

    public EventResourceForEventView setEntity(EventResourceForEventViewEntity entity) {
        this.entity = entity;
        return this;
    }
    public EventResourceForEventViewEntity getEntity() {
        return this.entity;
    }

    public EventResourceForEventView setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class EventResourceForEventViewEntity extends TeaModel {
        /**
         * <p>The product domain to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ECS&quot;</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;i-bp123456&quot;</p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The specific type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Instance&quot;</p>
         */
        @NameInMap("entityType")
        public String entityType;

        /**
         * <p>Extra properties of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;name&quot;: &quot;web-server-01&quot;, &quot;ip&quot;: &quot;10.0.0.1&quot; }</p>
         */
        @NameInMap("prop")
        public java.util.Map<String, ?> prop;

        public static EventResourceForEventViewEntity build(java.util.Map<String, ?> map) throws Exception {
            EventResourceForEventViewEntity self = new EventResourceForEventViewEntity();
            return TeaModel.build(map, self);
        }

        public EventResourceForEventViewEntity setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public EventResourceForEventViewEntity setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public EventResourceForEventViewEntity setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public EventResourceForEventViewEntity setProp(java.util.Map<String, ?> prop) {
            this.prop = prop;
            return this;
        }
        public java.util.Map<String, ?> getProp() {
            return this.prop;
        }

    }

}
