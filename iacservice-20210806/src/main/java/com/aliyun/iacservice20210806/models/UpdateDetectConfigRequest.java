// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateDetectConfigRequest extends TeaModel {
    /**
     * <p><strong>Alert address list</strong></p>
     */
    @NameInMap("alarmConfigs")
    public java.util.List<UpdateDetectConfigRequestAlarmConfigs> alarmConfigs;

    /**
     * <p>Idempotent token, format: [0-9a-zA-Z-]{1,64}. We recommend using a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p><strong>Cron expression (UTC+8)</strong>. Required when the trigger type is Cron.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 0 ? * 1</p>
     */
    @NameInMap("cronExpression")
    public String cronExpression;

    /**
     * <p><strong>Description</strong></p>
     * 
     * <strong>example:</strong>
     * <p>this is description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Drift detection name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("detectConfigName")
    public String detectConfigName;

    /**
     * <p><strong>Whether the detection feature is enabled. The default value is true.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p><strong>Trigger type</strong>  </p>
     * <ul>
     * <li>Manual: Execute manually  </li>
     * <li>Cron: Trigger periodically</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    public static UpdateDetectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectConfigRequest self = new UpdateDetectConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDetectConfigRequest setAlarmConfigs(java.util.List<UpdateDetectConfigRequestAlarmConfigs> alarmConfigs) {
        this.alarmConfigs = alarmConfigs;
        return this;
    }
    public java.util.List<UpdateDetectConfigRequestAlarmConfigs> getAlarmConfigs() {
        return this.alarmConfigs;
    }

    public UpdateDetectConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDetectConfigRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public UpdateDetectConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDetectConfigRequest setDetectConfigName(String detectConfigName) {
        this.detectConfigName = detectConfigName;
        return this;
    }
    public String getDetectConfigName() {
        return this.detectConfigName;
    }

    public UpdateDetectConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateDetectConfigRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public static class UpdateDetectConfigRequestAlarmConfigs extends TeaModel {
        /**
         * <p>Alert address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:example@example.com">example@example.com</a></p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <p>Alerting method.<br>Currently, only <code>cms</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateDetectConfigRequestAlarmConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateDetectConfigRequestAlarmConfigs self = new UpdateDetectConfigRequestAlarmConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateDetectConfigRequestAlarmConfigs setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public UpdateDetectConfigRequestAlarmConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
