// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResponsePlanForView extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

    /**
     * <strong>example:</strong>
     * <p>&quot;2025-04-05T10:30:00Z&quot;</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    /**
     * <strong>example:</strong>
     * <p>&quot;Manual&quot;</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>&quot;P1-Critical-Response-Plan&quot;</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("pushingSetting")
    public PushingSetting pushingSetting;

    @NameInMap("repeatNotifySetting")
    public RepeatNotifySetting repeatNotifySetting;

    /**
     * <strong>example:</strong>
     * <p>&quot;MANUAL&quot;</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>&quot;ARMS&quot;</p>
     */
    @NameInMap("syncFromType")
    public String syncFromType;

    /**
     * <strong>example:</strong>
     * <p>&quot;Standard&quot;</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>&quot;2025-04-06T09:15:00Z&quot;</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>&quot;a1b2c3d4-e5f6-7890-1234-567890abcdef&quot;</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <strong>example:</strong>
     * <p>&quot;ws-xyz789&quot;</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static IncidentResponsePlanForView build(java.util.Map<String, ?> map) throws Exception {
        IncidentResponsePlanForView self = new IncidentResponsePlanForView();
        return TeaModel.build(map, self);
    }

    public IncidentResponsePlanForView setAutoRecoverSeconds(Long autoRecoverSeconds) {
        this.autoRecoverSeconds = autoRecoverSeconds;
        return this;
    }
    public Long getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    public IncidentResponsePlanForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IncidentResponsePlanForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncidentResponsePlanForView setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public IncidentResponsePlanForView setEscalationId(java.util.List<String> escalationId) {
        this.escalationId = escalationId;
        return this;
    }
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    public IncidentResponsePlanForView setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public IncidentResponsePlanForView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IncidentResponsePlanForView setPushingSetting(PushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public PushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public IncidentResponsePlanForView setRepeatNotifySetting(RepeatNotifySetting repeatNotifySetting) {
        this.repeatNotifySetting = repeatNotifySetting;
        return this;
    }
    public RepeatNotifySetting getRepeatNotifySetting() {
        return this.repeatNotifySetting;
    }

    public IncidentResponsePlanForView setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public IncidentResponsePlanForView setSyncFromType(String syncFromType) {
        this.syncFromType = syncFromType;
        return this;
    }
    public String getSyncFromType() {
        return this.syncFromType;
    }

    public IncidentResponsePlanForView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IncidentResponsePlanForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public IncidentResponsePlanForView setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public IncidentResponsePlanForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
