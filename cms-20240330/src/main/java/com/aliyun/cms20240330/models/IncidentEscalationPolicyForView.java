// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationPolicyForView extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace api monitor update test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the policy is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The list of escalation stages.</p>
     */
    @NameInMap("escalationStageList")
    public java.util.List<IncidentEscalationStageForView> escalationStageList;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Critical-Alert-Escalation&quot;</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The owner type.</p>
     * <ul>
     * <li><p><strong>USER</strong>: User. This is the default value.</p>
     * </li>
     * <li><p><strong>APP</strong>: Application.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;USER&quot;</p>
     */
    @NameInMap("ownerType")
    public String ownerType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;cn-hangzhou&quot;</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;MANUAL&quot;</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The source type of the synchronization policy.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ARMS&quot;</p>
     */
    @NameInMap("syncFromType")
    public String syncFromType;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-15T02:02:50Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;user-abc123&quot;</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The globally unique identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;a1b2c3d4-e5f6-7890-1234-567890abcdef&quot;</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ws-xyz789&quot;</p>
     */
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
