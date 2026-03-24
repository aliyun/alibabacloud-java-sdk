// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResourceStruct extends TeaModel {
    /**
     * <p>描述信息。</p>
     * 
     * <strong>example:</strong>
     * <p>生产环境 Web 服务器</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>事件ID。</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>事件中该资源的唯一 ID。</p>
     * 
     * <strong>example:</strong>
     * <p>res-001</p>
     */
    @NameInMap("incidentResourceId")
    public String incidentResourceId;

    /**
     * <p>事件资源详情对象。</p>
     */
    @NameInMap("resource")
    public IncidentResourceDetail resource;

    /**
     * <p>来源。</p>
     * 
     * <strong>example:</strong>
     * <p>cloudmonitor</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>时间戳</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>用户 ID。</p>
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
