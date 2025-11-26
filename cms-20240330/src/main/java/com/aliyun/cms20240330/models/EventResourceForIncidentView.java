// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EventResourceForIncidentView extends TeaModel {
    @NameInMap("domain")
    public String domain;

    @NameInMap("entityId")
    public String entityId;

    @NameInMap("entityType")
    public String entityType;

    @NameInMap("probs")
    public String probs;

    @NameInMap("tags")
    public String tags;

    public static EventResourceForIncidentView build(java.util.Map<String, ?> map) throws Exception {
        EventResourceForIncidentView self = new EventResourceForIncidentView();
        return TeaModel.build(map, self);
    }

    public EventResourceForIncidentView setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public EventResourceForIncidentView setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public EventResourceForIncidentView setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public EventResourceForIncidentView setProbs(String probs) {
        this.probs = probs;
        return this;
    }
    public String getProbs() {
        return this.probs;
    }

    public EventResourceForIncidentView setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
