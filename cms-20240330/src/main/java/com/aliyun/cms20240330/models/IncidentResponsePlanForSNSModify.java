// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResponsePlanForSNSModify extends TeaModel {
    /**
     * <p>The auto-recovery time. Unit: seconds. After this is configured, if no new events are generated for the incident within this period, the incident is automatically marked as resolved.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

    /**
     * <p>The list of escalation policy IDs. Associates with IncidentEscalationPolicy to define step-by-step escalation rules when an incident is not handled as expected, such as notifying a supervisor if the incident is not acknowledged within 30 minutes.</p>
     */
    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    /**
     * <p>The action integration execution configuration that defines automated actions to trigger when an incident occurs and when it is recovered.</p>
     */
    @NameInMap("pushingSetting")
    public IncidentResponsePlanForSNSModifyPushingSetting pushingSetting;

    /**
     * <p>The repeat notification settings. When an incident remains unresolved, notifications are sent repeatedly at a fixed interval.</p>
     */
    @NameInMap("repeatNotifySetting")
    public IncidentResponsePlanForSNSModifyRepeatNotifySetting repeatNotifySetting;

    public static IncidentResponsePlanForSNSModify build(java.util.Map<String, ?> map) throws Exception {
        IncidentResponsePlanForSNSModify self = new IncidentResponsePlanForSNSModify();
        return TeaModel.build(map, self);
    }

    public IncidentResponsePlanForSNSModify setAutoRecoverSeconds(Long autoRecoverSeconds) {
        this.autoRecoverSeconds = autoRecoverSeconds;
        return this;
    }
    public Long getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    public IncidentResponsePlanForSNSModify setEscalationId(java.util.List<String> escalationId) {
        this.escalationId = escalationId;
        return this;
    }
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    public IncidentResponsePlanForSNSModify setPushingSetting(IncidentResponsePlanForSNSModifyPushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public IncidentResponsePlanForSNSModifyPushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public IncidentResponsePlanForSNSModify setRepeatNotifySetting(IncidentResponsePlanForSNSModifyRepeatNotifySetting repeatNotifySetting) {
        this.repeatNotifySetting = repeatNotifySetting;
        return this;
    }
    public IncidentResponsePlanForSNSModifyRepeatNotifySetting getRepeatNotifySetting() {
        return this.repeatNotifySetting;
    }

    public static class IncidentResponsePlanForSNSModifyPushingSetting extends TeaModel {
        /**
         * <p>The list of action IDs to execute when an event is triggered. Actions must be created in advance by calling CreateAlertAction.</p>
         */
        @NameInMap("alertActionIds")
        public java.util.List<String> alertActionIds;

        /**
         * <p>The list of action IDs to execute when an event is recovered.</p>
         */
        @NameInMap("restoreActionIds")
        public java.util.List<String> restoreActionIds;

        /**
         * <p>Deprecated. This parameter does not take effect even if a value is passed in.</p>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        @NameInMap("templateUuid")
        public String templateUuid;

        public static IncidentResponsePlanForSNSModifyPushingSetting build(java.util.Map<String, ?> map) throws Exception {
            IncidentResponsePlanForSNSModifyPushingSetting self = new IncidentResponsePlanForSNSModifyPushingSetting();
            return TeaModel.build(map, self);
        }

        public IncidentResponsePlanForSNSModifyPushingSetting setAlertActionIds(java.util.List<String> alertActionIds) {
            this.alertActionIds = alertActionIds;
            return this;
        }
        public java.util.List<String> getAlertActionIds() {
            return this.alertActionIds;
        }

        public IncidentResponsePlanForSNSModifyPushingSetting setRestoreActionIds(java.util.List<String> restoreActionIds) {
            this.restoreActionIds = restoreActionIds;
            return this;
        }
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

        public IncidentResponsePlanForSNSModifyPushingSetting setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class IncidentResponsePlanForSNSModifyRepeatNotifySetting extends TeaModel {
        /**
         * <p>The incident status at which repeat notifications stop. Repeat notifications are no longer sent after the incident reaches this status.</p>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("endIncidentState")
        public String endIncidentState;

        /**
         * <p>The repeat notification interval. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("repeatInterval")
        public Integer repeatInterval;

        public static IncidentResponsePlanForSNSModifyRepeatNotifySetting build(java.util.Map<String, ?> map) throws Exception {
            IncidentResponsePlanForSNSModifyRepeatNotifySetting self = new IncidentResponsePlanForSNSModifyRepeatNotifySetting();
            return TeaModel.build(map, self);
        }

        public IncidentResponsePlanForSNSModifyRepeatNotifySetting setEndIncidentState(String endIncidentState) {
            this.endIncidentState = endIncidentState;
            return this;
        }
        public String getEndIncidentState() {
            return this.endIncidentState;
        }

        public IncidentResponsePlanForSNSModifyRepeatNotifySetting setRepeatInterval(Integer repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

    }

}
