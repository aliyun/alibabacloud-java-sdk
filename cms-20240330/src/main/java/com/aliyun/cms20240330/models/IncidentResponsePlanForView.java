// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResponsePlanForView extends TeaModel {
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    @NameInMap("mode")
    public String mode;

    @NameInMap("name")
    public String name;

    @NameInMap("pushingSetting")
    public PushingSetting pushingSetting;

    @NameInMap("repeatNotifySetting")
    public RepeatNotifySetting repeatNotifySetting;

    @NameInMap("source")
    public String source;

    @NameInMap("syncFromType")
    public String syncFromType;

    @NameInMap("type")
    public String type;

    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("uuid")
    public String uuid;

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
