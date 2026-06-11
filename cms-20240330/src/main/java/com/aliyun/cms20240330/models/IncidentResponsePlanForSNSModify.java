// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResponsePlanForSNSModify extends TeaModel {
    /**
     * <p>The auto recovery time, in seconds. After this period, the incident is automatically resolved.</p>
     */
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

    /**
     * <p>The IDs of the escalation policies.</p>
     */
    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    /**
     * <p>The push setting for notifications.</p>
     */
    @NameInMap("pushingSetting")
    public IncidentResponsePlanForSNSModifyPushingSetting pushingSetting;

    /**
     * <p>The repeat notification setting.</p>
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
         * <p>The IDs of the alert actions.</p>
         */
        @NameInMap("alertActionIds")
        public java.util.List<String> alertActionIds;

        /**
         * <p>The IDs of the restore actions.</p>
         */
        @NameInMap("restoreActionIds")
        public java.util.List<String> restoreActionIds;

        /**
         * <p>The UUID of the notification template.</p>
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
         * <p>The incident state that stops repeat notifications.</p>
         */
        @NameInMap("endIncidentState")
        public String endIncidentState;

        /**
         * <p>The repeat interval for notifications, in seconds.</p>
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
