// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResponsePlanForModify extends TeaModel {
    /**
     * <p>The auto-recovery time in seconds when no events occur.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the response plan is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The list of escalation plan IDs.</p>
     */
    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    /**
     * <p>The lifecycle mode.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The push settings.</p>
     */
    @NameInMap("pushingSetting")
    public PushingSetting pushingSetting;

    /**
     * <p>The repeat notification configuration.</p>
     */
    @NameInMap("repeatNotifySetting")
    public RepeatNotifySetting repeatNotifySetting;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The synchronization source type.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("syncFromType")
    public String syncFromType;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Required for Update. Can be omitted for Create, in which case the backend generates it. The UUID is shared with NotifyStrategy.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
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
