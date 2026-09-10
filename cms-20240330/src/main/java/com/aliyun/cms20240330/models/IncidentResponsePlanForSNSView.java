// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResponsePlanForSNSView extends TeaModel {
    /**
     * <p>The auto-recovery time when no incidents occur, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000000</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>Indicates whether the response plan is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The list of escalation plan IDs.</p>
     */
    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    /**
     * <p>The lifecycle mode.</p>
     * 
     * <strong>example:</strong>
     * <p>NOTIFY_STRATEGY_DEFINED</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample response plan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The push settings.</p>
     */
    @NameInMap("pushingSetting")
    public IncidentResponsePlanForSNSViewPushingSetting pushingSetting;

    /**
     * <p>The repeat notification configuration.</p>
     */
    @NameInMap("repeatNotifySetting")
    public IncidentResponsePlanForSNSViewRepeatNotifySetting repeatNotifySetting;

    /**
     * <p>The source. The value must be CUSTOM within SNS.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The synchronization source type.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("syncFromType")
    public String syncFromType;

    /**
     * <p>The response plan type. The value must be NOTIFY_STRATEGY_DEFINED within SNS.</p>
     * 
     * <strong>example:</strong>
     * <p>NOTIFY_STRATEGY_DEFINED</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000000</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The unique identifier of the response plan.</p>
     * 
     * <strong>example:</strong>
     * <p>abc-def-12345</p>
     */
    @NameInMap("uuid")
    public String uuid;

    public static IncidentResponsePlanForSNSView build(java.util.Map<String, ?> map) throws Exception {
        IncidentResponsePlanForSNSView self = new IncidentResponsePlanForSNSView();
        return TeaModel.build(map, self);
    }

    public IncidentResponsePlanForSNSView setAutoRecoverSeconds(Long autoRecoverSeconds) {
        this.autoRecoverSeconds = autoRecoverSeconds;
        return this;
    }
    public Long getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    public IncidentResponsePlanForSNSView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IncidentResponsePlanForSNSView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public IncidentResponsePlanForSNSView setEscalationId(java.util.List<String> escalationId) {
        this.escalationId = escalationId;
        return this;
    }
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    public IncidentResponsePlanForSNSView setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public IncidentResponsePlanForSNSView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IncidentResponsePlanForSNSView setPushingSetting(IncidentResponsePlanForSNSViewPushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public IncidentResponsePlanForSNSViewPushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public IncidentResponsePlanForSNSView setRepeatNotifySetting(IncidentResponsePlanForSNSViewRepeatNotifySetting repeatNotifySetting) {
        this.repeatNotifySetting = repeatNotifySetting;
        return this;
    }
    public IncidentResponsePlanForSNSViewRepeatNotifySetting getRepeatNotifySetting() {
        return this.repeatNotifySetting;
    }

    public IncidentResponsePlanForSNSView setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public IncidentResponsePlanForSNSView setSyncFromType(String syncFromType) {
        this.syncFromType = syncFromType;
        return this;
    }
    public String getSyncFromType() {
        return this.syncFromType;
    }

    public IncidentResponsePlanForSNSView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IncidentResponsePlanForSNSView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public IncidentResponsePlanForSNSView setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class IncidentResponsePlanForSNSViewPushingSetting extends TeaModel {
        /**
         * <p>The list of response action IDs triggered by alerts.</p>
         */
        @NameInMap("alertActionIds")
        public java.util.List<String> alertActionIds;

        /**
         * <p>The list of response action IDs triggered by alert recovery.</p>
         */
        @NameInMap("restoreActionIds")
        public java.util.List<String> restoreActionIds;

        /**
         * <p>The UUID of the template used for pushing.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-001</p>
         */
        @NameInMap("templateUuid")
        public String templateUuid;

        public static IncidentResponsePlanForSNSViewPushingSetting build(java.util.Map<String, ?> map) throws Exception {
            IncidentResponsePlanForSNSViewPushingSetting self = new IncidentResponsePlanForSNSViewPushingSetting();
            return TeaModel.build(map, self);
        }

        public IncidentResponsePlanForSNSViewPushingSetting setAlertActionIds(java.util.List<String> alertActionIds) {
            this.alertActionIds = alertActionIds;
            return this;
        }
        public java.util.List<String> getAlertActionIds() {
            return this.alertActionIds;
        }

        public IncidentResponsePlanForSNSViewPushingSetting setRestoreActionIds(java.util.List<String> restoreActionIds) {
            this.restoreActionIds = restoreActionIds;
            return this;
        }
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

        public IncidentResponsePlanForSNSViewPushingSetting setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class IncidentResponsePlanForSNSViewRepeatNotifySetting extends TeaModel {
        /**
         * <p>The setting that specifies whether to send repeat notifications when an incident ends.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("endIncidentState")
        public String endIncidentState;

        /**
         * <p>The repeat notification interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("repeatInterval")
        public Integer repeatInterval;

        public static IncidentResponsePlanForSNSViewRepeatNotifySetting build(java.util.Map<String, ?> map) throws Exception {
            IncidentResponsePlanForSNSViewRepeatNotifySetting self = new IncidentResponsePlanForSNSViewRepeatNotifySetting();
            return TeaModel.build(map, self);
        }

        public IncidentResponsePlanForSNSViewRepeatNotifySetting setEndIncidentState(String endIncidentState) {
            this.endIncidentState = endIncidentState;
            return this;
        }
        public String getEndIncidentState() {
            return this.endIncidentState;
        }

        public IncidentResponsePlanForSNSViewRepeatNotifySetting setRepeatInterval(Integer repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

    }

}
