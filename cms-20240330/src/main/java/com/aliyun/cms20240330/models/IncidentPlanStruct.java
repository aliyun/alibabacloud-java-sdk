// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentPlanStruct extends TeaModel {
    /**
     * <p>The wait time for automatic recovery.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("autoRecoverSeconds")
    public Integer autoRecoverSeconds;

    /**
     * <p>The timeout period for closing an event.</p>
     * 
     * <strong>example:</strong>
     * <p>86400000</p>
     */
    @NameInMap("closeExpire")
    public Long closeExpire;

    /**
     * <p>A list of collaborating teams or roles.</p>
     */
    @NameInMap("corporation")
    public java.util.List<IncidentPlanCorporationStruct> corporation;

    /**
     * <p>The description of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>针对数据库连接数过高的应急处理方案</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>A list of escalation policy IDs.</p>
     */
    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    /**
     * <p>The time when the plan was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>The time when the plan was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The grouping field path.</p>
     */
    @NameInMap("groupBy")
    public java.util.List<IncidentPlanFieldPath> groupBy;

    /**
     * <p>The incident plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>plan-001</p>
     */
    @NameInMap("incidentPlanId")
    public String incidentPlanId;

    /**
     * <p>The name of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>数据库连接数告警预案</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>A list of resource field mapping paths.</p>
     */
    @NameInMap("resourceFiled")
    public java.util.List<IncidentPlanFieldPath> resourceFiled;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>uesr-12345</p>
     */
    @NameInMap("userId")
    public Long userId;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static IncidentPlanStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentPlanStruct self = new IncidentPlanStruct();
        return TeaModel.build(map, self);
    }

    public IncidentPlanStruct setAutoRecoverSeconds(Integer autoRecoverSeconds) {
        this.autoRecoverSeconds = autoRecoverSeconds;
        return this;
    }
    public Integer getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    public IncidentPlanStruct setCloseExpire(Long closeExpire) {
        this.closeExpire = closeExpire;
        return this;
    }
    public Long getCloseExpire() {
        return this.closeExpire;
    }

    public IncidentPlanStruct setCorporation(java.util.List<IncidentPlanCorporationStruct> corporation) {
        this.corporation = corporation;
        return this;
    }
    public java.util.List<IncidentPlanCorporationStruct> getCorporation() {
        return this.corporation;
    }

    public IncidentPlanStruct setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncidentPlanStruct setEscalationId(java.util.List<String> escalationId) {
        this.escalationId = escalationId;
        return this;
    }
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    public IncidentPlanStruct setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public IncidentPlanStruct setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public IncidentPlanStruct setGroupBy(java.util.List<IncidentPlanFieldPath> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<IncidentPlanFieldPath> getGroupBy() {
        return this.groupBy;
    }

    public IncidentPlanStruct setIncidentPlanId(String incidentPlanId) {
        this.incidentPlanId = incidentPlanId;
        return this;
    }
    public String getIncidentPlanId() {
        return this.incidentPlanId;
    }

    public IncidentPlanStruct setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IncidentPlanStruct setResourceFiled(java.util.List<IncidentPlanFieldPath> resourceFiled) {
        this.resourceFiled = resourceFiled;
        return this;
    }
    public java.util.List<IncidentPlanFieldPath> getResourceFiled() {
        return this.resourceFiled;
    }

    public IncidentPlanStruct setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IncidentPlanStruct setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public IncidentPlanStruct setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
