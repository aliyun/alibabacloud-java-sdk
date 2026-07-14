// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ResponsePlanDetail extends TeaModel {
    /**
     * <p>The number of seconds for automatic recovery. If no new trigger occurs within this duration, the event is automatically recovered.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("autoRecoverSeconds")
    public Long autoRecoverSeconds;

    /**
     * <p>The list of escalation plan IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;esc-uuid-xxx&quot;]</p>
     */
    @NameInMap("escalationId")
    public java.util.List<String> escalationId;

    /**
     * <p>The action integration push settings.</p>
     */
    @NameInMap("pushingSetting")
    public ResponsePlanDetailPushingSetting pushingSetting;

    /**
     * <p>The repeat notification configuration.</p>
     */
    @NameInMap("repeatNotifySetting")
    public ResponsePlanDetailRepeatNotifySetting repeatNotifySetting;

    public static ResponsePlanDetail build(java.util.Map<String, ?> map) throws Exception {
        ResponsePlanDetail self = new ResponsePlanDetail();
        return TeaModel.build(map, self);
    }

    public ResponsePlanDetail setAutoRecoverSeconds(Long autoRecoverSeconds) {
        this.autoRecoverSeconds = autoRecoverSeconds;
        return this;
    }
    public Long getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    public ResponsePlanDetail setEscalationId(java.util.List<String> escalationId) {
        this.escalationId = escalationId;
        return this;
    }
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    public ResponsePlanDetail setPushingSetting(ResponsePlanDetailPushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public ResponsePlanDetailPushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public ResponsePlanDetail setRepeatNotifySetting(ResponsePlanDetailRepeatNotifySetting repeatNotifySetting) {
        this.repeatNotifySetting = repeatNotifySetting;
        return this;
    }
    public ResponsePlanDetailRepeatNotifySetting getRepeatNotifySetting() {
        return this.repeatNotifySetting;
    }

    public static class ResponsePlanDetailPushingSetting extends TeaModel {
        /**
         * <p>The list of action integration IDs triggered by alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;action-uuid-xxx&quot;]</p>
         */
        @NameInMap("alertActionIds")
        public java.util.List<String> alertActionIds;

        /**
         * <p>The list of action integration IDs triggered by recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;action-uuid-yyy&quot;]</p>
         */
        @NameInMap("restoreActionIds")
        public java.util.List<String> restoreActionIds;

        public static ResponsePlanDetailPushingSetting build(java.util.Map<String, ?> map) throws Exception {
            ResponsePlanDetailPushingSetting self = new ResponsePlanDetailPushingSetting();
            return TeaModel.build(map, self);
        }

        public ResponsePlanDetailPushingSetting setAlertActionIds(java.util.List<String> alertActionIds) {
            this.alertActionIds = alertActionIds;
            return this;
        }
        public java.util.List<String> getAlertActionIds() {
            return this.alertActionIds;
        }

        public ResponsePlanDetailPushingSetting setRestoreActionIds(java.util.List<String> restoreActionIds) {
            this.restoreActionIds = restoreActionIds;
            return this;
        }
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

    }

    public static class ResponsePlanDetailRepeatNotifySetting extends TeaModel {
        /**
         * <p>The target event status at which repeated notifications stop.</p>
         * 
         * <strong>example:</strong>
         * <p>RECOVERED</p>
         */
        @NameInMap("endIncidentState")
        public String endIncidentState;

        /**
         * <p>The interval for repeated notifications, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("repeatInterval")
        public Integer repeatInterval;

        public static ResponsePlanDetailRepeatNotifySetting build(java.util.Map<String, ?> map) throws Exception {
            ResponsePlanDetailRepeatNotifySetting self = new ResponsePlanDetailRepeatNotifySetting();
            return TeaModel.build(map, self);
        }

        public ResponsePlanDetailRepeatNotifySetting setEndIncidentState(String endIncidentState) {
            this.endIncidentState = endIncidentState;
            return this;
        }
        public String getEndIncidentState() {
            return this.endIncidentState;
        }

        public ResponsePlanDetailRepeatNotifySetting setRepeatInterval(Integer repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

    }

}
