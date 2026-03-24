// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationStruct extends TeaModel {
    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>描述。</p>
     * 
     * <strong>example:</strong>
     * <p>当告警未响应时，依次通知运维团队、值班经理、CTO</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>事件升级ID</p>
     * 
     * <strong>example:</strong>
     * <p>52631388567</p>
     */
    @NameInMap("incidentEscalationId")
    public String incidentEscalationId;

    /**
     * <p>修改时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("modifyTime")
    public Long modifyTime;

    /**
     * <p>名称。</p>
     * 
     * <strong>example:</strong>
     * <p>生产环境告警升级策略</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>地域 ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>阶段。</p>
     */
    @NameInMap("stage")
    public java.util.List<IncidentEscalationStageStruct> stage;

    /**
     * <p>工作空间</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static IncidentEscalationStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentEscalationStruct self = new IncidentEscalationStruct();
        return TeaModel.build(map, self);
    }

    public IncidentEscalationStruct setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public IncidentEscalationStruct setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncidentEscalationStruct setIncidentEscalationId(String incidentEscalationId) {
        this.incidentEscalationId = incidentEscalationId;
        return this;
    }
    public String getIncidentEscalationId() {
        return this.incidentEscalationId;
    }

    public IncidentEscalationStruct setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public IncidentEscalationStruct setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IncidentEscalationStruct setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public IncidentEscalationStruct setStage(java.util.List<IncidentEscalationStageStruct> stage) {
        this.stage = stage;
        return this;
    }
    public java.util.List<IncidentEscalationStageStruct> getStage() {
        return this.stage;
    }

    public IncidentEscalationStruct setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
