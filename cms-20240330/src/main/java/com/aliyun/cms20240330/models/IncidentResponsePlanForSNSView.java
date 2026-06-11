// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResponsePlanForSNSView extends TeaModel {
    /**
     * <p>The duration, in seconds, after which an incident without new alerts is automatically resolved.</p>
     */
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

    /**
     * <p>The time when the incident response plan was created, in UTC and in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>Indicates if the incident response plan is enabled. Valid values: <code>true</code> and <code>false</code>.</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The IDs of the escalation policies.</p>
     */
    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    /**
     * <p>The mode of the incident response plan. Valid values: <code>AUTO</code> and <code>MANUAL</code>.</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The name of the incident response plan.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The settings for sending notifications.</p>
     */
    @NameInMap("pushingSetting")
    public IncidentResponsePlanForSNSViewPushingSetting pushingSetting;

    /**
     * <p>The settings for repeated notifications.</p>
     */
    @NameInMap("repeatNotifySetting")
    public IncidentResponsePlanForSNSViewRepeatNotifySetting repeatNotifySetting;

    /**
     * <p>The source of the incident.</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The synchronization source type.</p>
     */
    @NameInMap("syncFromType")
    public String syncFromType;

    /**
     * <p>The type of the incident response plan.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The time when the incident response plan was last updated, in UTC and in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The unique ID of the incident response plan.</p>
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
         * <p>The IDs of actions to run when an alert is triggered.</p>
         */
        @NameInMap("alertActionIds")
        public java.util.List<String> alertActionIds;

        /**
         * <p>The IDs of actions to run when the incident is resolved.</p>
         */
        @NameInMap("restoreActionIds")
        public java.util.List<String> restoreActionIds;

        /**
         * <p>The ID of the notification template.</p>
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
         * <p>The incident state at which repeated notifications stop. For example, <code>resolved</code>.</p>
         */
        @NameInMap("endIncidentState")
        public String endIncidentState;

        /**
         * <p>The interval, in seconds, for repeated notifications.</p>
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
