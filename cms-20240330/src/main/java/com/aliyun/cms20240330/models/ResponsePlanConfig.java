// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ResponsePlanConfig extends TeaModel {
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
    public ResponsePlanConfigPushingSetting pushingSetting;

    /**
     * <p>The repeat notification configuration.</p>
     */
    @NameInMap("repeatNotifySetting")
    public ResponsePlanConfigRepeatNotifySetting repeatNotifySetting;

    public static ResponsePlanConfig build(java.util.Map<String, ?> map) throws Exception {
        ResponsePlanConfig self = new ResponsePlanConfig();
        return TeaModel.build(map, self);
    }

    public ResponsePlanConfig setAutoRecoverSeconds(Long autoRecoverSeconds) {
        this.autoRecoverSeconds = autoRecoverSeconds;
        return this;
    }
    public Long getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    public ResponsePlanConfig setEscalationId(java.util.List<String> escalationId) {
        this.escalationId = escalationId;
        return this;
    }
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    public ResponsePlanConfig setPushingSetting(ResponsePlanConfigPushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public ResponsePlanConfigPushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public ResponsePlanConfig setRepeatNotifySetting(ResponsePlanConfigRepeatNotifySetting repeatNotifySetting) {
        this.repeatNotifySetting = repeatNotifySetting;
        return this;
    }
    public ResponsePlanConfigRepeatNotifySetting getRepeatNotifySetting() {
        return this.repeatNotifySetting;
    }

    public static class ResponsePlanConfigPushingSetting extends TeaModel {
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

        public static ResponsePlanConfigPushingSetting build(java.util.Map<String, ?> map) throws Exception {
            ResponsePlanConfigPushingSetting self = new ResponsePlanConfigPushingSetting();
            return TeaModel.build(map, self);
        }

        public ResponsePlanConfigPushingSetting setAlertActionIds(java.util.List<String> alertActionIds) {
            this.alertActionIds = alertActionIds;
            return this;
        }
        public java.util.List<String> getAlertActionIds() {
            return this.alertActionIds;
        }

        public ResponsePlanConfigPushingSetting setRestoreActionIds(java.util.List<String> restoreActionIds) {
            this.restoreActionIds = restoreActionIds;
            return this;
        }
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

    }

    public static class ResponsePlanConfigRepeatNotifySetting extends TeaModel {
        /**
         * <p>The target incident status at which repeat notifications stop.</p>
         * 
         * <strong>example:</strong>
         * <p>RECOVERED</p>
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

        public static ResponsePlanConfigRepeatNotifySetting build(java.util.Map<String, ?> map) throws Exception {
            ResponsePlanConfigRepeatNotifySetting self = new ResponsePlanConfigRepeatNotifySetting();
            return TeaModel.build(map, self);
        }

        public ResponsePlanConfigRepeatNotifySetting setEndIncidentState(String endIncidentState) {
            this.endIncidentState = endIncidentState;
            return this;
        }
        public String getEndIncidentState() {
            return this.endIncidentState;
        }

        public ResponsePlanConfigRepeatNotifySetting setRepeatInterval(Integer repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

    }

}
