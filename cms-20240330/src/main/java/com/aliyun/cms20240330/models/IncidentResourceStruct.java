// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResourceStruct extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("incidentId")
    public String incidentId;

    @NameInMap("incidentResourceId")
    public String incidentResourceId;

    @NameInMap("resource")
    public IncidentResourceDetail resource;

    @NameInMap("source")
    public String source;

    @NameInMap("time")
    public Long time;

    @NameInMap("userId")
    public Long userId;

    public static IncidentResourceStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentResourceStruct self = new IncidentResourceStruct();
        return TeaModel.build(map, self);
    }

    public IncidentResourceStruct setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncidentResourceStruct setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public IncidentResourceStruct setIncidentResourceId(String incidentResourceId) {
        this.incidentResourceId = incidentResourceId;
        return this;
    }
    public String getIncidentResourceId() {
        return this.incidentResourceId;
    }

    public IncidentResourceStruct setResource(IncidentResourceDetail resource) {
        this.resource = resource;
        return this;
    }
    public IncidentResourceDetail getResource() {
        return this.resource;
    }

    public IncidentResourceStruct setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public IncidentResourceStruct setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public IncidentResourceStruct setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
