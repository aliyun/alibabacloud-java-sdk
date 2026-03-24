// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationPolicyForView extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("escalationStageList")
    public java.util.List<IncidentEscalationStageForView> escalationStageList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("ownerType")
    public String ownerType;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("source")
    public String source;

    @NameInMap("syncFromType")
    public String syncFromType;

    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("userId")
    public String userId;

    @NameInMap("uuid")
    public String uuid;

    @NameInMap("workspace")
    public String workspace;

    public static IncidentEscalationPolicyForView build(java.util.Map<String, ?> map) throws Exception {
        IncidentEscalationPolicyForView self = new IncidentEscalationPolicyForView();
        return TeaModel.build(map, self);
    }

    public IncidentEscalationPolicyForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IncidentEscalationPolicyForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncidentEscalationPolicyForView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public IncidentEscalationPolicyForView setEscalationStageList(java.util.List<IncidentEscalationStageForView> escalationStageList) {
        this.escalationStageList = escalationStageList;
        return this;
    }
    public java.util.List<IncidentEscalationStageForView> getEscalationStageList() {
        return this.escalationStageList;
    }

    public IncidentEscalationPolicyForView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IncidentEscalationPolicyForView setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public IncidentEscalationPolicyForView setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public IncidentEscalationPolicyForView setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public IncidentEscalationPolicyForView setSyncFromType(String syncFromType) {
        this.syncFromType = syncFromType;
        return this;
    }
    public String getSyncFromType() {
        return this.syncFromType;
    }

    public IncidentEscalationPolicyForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public IncidentEscalationPolicyForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IncidentEscalationPolicyForView setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public IncidentEscalationPolicyForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
