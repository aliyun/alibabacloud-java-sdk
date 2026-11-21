// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationStruct extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1794984055029</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Notify the O&amp;M team, on-call manager, and CTO sequentially when an alert is not responded to</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The incident escalation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52631388567</p>
     */
    @NameInMap("incidentEscalationId")
    public String incidentEscalationId;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1794984055029</p>
     */
    @NameInMap("modifyTime")
    public Long modifyTime;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>Production environment alert escalation policy</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The stage.</p>
     */
    @NameInMap("stage")
    public java.util.List<IncidentEscalationStageStruct> stage;

    /**
     * <p>The workspace.</p>
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
