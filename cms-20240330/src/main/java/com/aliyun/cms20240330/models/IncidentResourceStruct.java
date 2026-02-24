// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResourceStruct extends TeaModel {
    /**
     * <p>Description information.</p>
     * 
     * <strong>example:</strong>
     * <p>Production environment web server.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Incident ID.</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>The unique ID of this resource in the event.</p>
     * 
     * <strong>example:</strong>
     * <p>res-001</p>
     */
    @NameInMap("incidentResourceId")
    public String incidentResourceId;

    /**
     * <p>Event resource details object.</p>
     */
    @NameInMap("resource")
    public IncidentResourceDetail resource;

    /**
     * <p>Source.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudmonitor</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>Time.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>User ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user-12345</p>
     */
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
