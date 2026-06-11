// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResponsePlanForModify extends TeaModel {
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

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

    /**
     * <p>Required for update operations. Optional for create operations; if omitted, the backend generates one. <code>NotifyStrategy</code> also uses this UUID.</p>
     */
    @NameInMap("uuid")
    public String uuid;

    public static IncidentResponsePlanForModify build(java.util.Map<String, ?> map) throws Exception {
        IncidentResponsePlanForModify self = new IncidentResponsePlanForModify();
        return TeaModel.build(map, self);
    }

    public IncidentResponsePlanForModify setAutoRecoverSeconds(Long autoRecoverSeconds) {
        this.autoRecoverSeconds = autoRecoverSeconds;
        return this;
    }
    public Long getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    public IncidentResponsePlanForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncidentResponsePlanForModify setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public IncidentResponsePlanForModify setEscalationId(java.util.List<String> escalationId) {
        this.escalationId = escalationId;
        return this;
    }
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    public IncidentResponsePlanForModify setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public IncidentResponsePlanForModify setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IncidentResponsePlanForModify setPushingSetting(PushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public PushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public IncidentResponsePlanForModify setRepeatNotifySetting(RepeatNotifySetting repeatNotifySetting) {
        this.repeatNotifySetting = repeatNotifySetting;
        return this;
    }
    public RepeatNotifySetting getRepeatNotifySetting() {
        return this.repeatNotifySetting;
    }

    public IncidentResponsePlanForModify setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public IncidentResponsePlanForModify setSyncFromType(String syncFromType) {
        this.syncFromType = syncFromType;
        return this;
    }
    public String getSyncFromType() {
        return this.syncFromType;
    }

    public IncidentResponsePlanForModify setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IncidentResponsePlanForModify setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
