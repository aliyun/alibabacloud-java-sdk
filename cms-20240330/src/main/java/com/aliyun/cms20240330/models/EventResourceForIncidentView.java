// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EventResourceForIncidentView extends TeaModel {
    /**
     * <p>The domain of the resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>rum</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("entityId")
    public String entityId;

    /**
     * <p>The entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Instance&quot;</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>The string that describes the properties of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;name&quot;:&quot;web-server-01&quot;,&quot;ip&quot;:&quot;10.0.0.1&quot;}&quot;</p>
     */
    @NameInMap("probs")
    public String probs;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;value\&quot;:\&quot;测试\&quot;,\&quot;key\&quot;:\&quot;环境\&quot;}]</p>
     */
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
