// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EventResourceForEventView extends TeaModel {
    @NameInMap("entity")
    public EventResourceForEventViewEntity entity;

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
        @NameInMap("domain")
        public String domain;

        @NameInMap("entityId")
        public String entityId;

        @NameInMap("entityType")
        public String entityType;

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
