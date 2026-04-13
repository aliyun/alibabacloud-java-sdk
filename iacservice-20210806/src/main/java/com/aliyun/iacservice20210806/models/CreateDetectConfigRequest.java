// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateDetectConfigRequest extends TeaModel {
    @NameInMap("alarmConfigs")
    public java.util.List<CreateDetectConfigRequestAlarmConfigs> alarmConfigs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>0 0 0 ? * 1</p>
     */
    @NameInMap("cronExpression")
    public String cronExpression;

    /**
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("detectConfigName")
    public String detectConfigName;

    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    public static CreateDetectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectConfigRequest self = new CreateDetectConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateDetectConfigRequest setAlarmConfigs(java.util.List<CreateDetectConfigRequestAlarmConfigs> alarmConfigs) {
        this.alarmConfigs = alarmConfigs;
        return this;
    }
    public java.util.List<CreateDetectConfigRequestAlarmConfigs> getAlarmConfigs() {
        return this.alarmConfigs;
    }

    public CreateDetectConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDetectConfigRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateDetectConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDetectConfigRequest setDetectConfigName(String detectConfigName) {
        this.detectConfigName = detectConfigName;
        return this;
    }
    public String getDetectConfigName() {
        return this.detectConfigName;
    }

    public CreateDetectConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateDetectConfigRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public static class CreateDetectConfigRequestAlarmConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://metrichub-cms-cn-hangzhou.aliyuncs.com/event/notify?xxxxx">https://metrichub-cms-cn-hangzhou.aliyuncs.com/event/notify?xxxxx</a></p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateDetectConfigRequestAlarmConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateDetectConfigRequestAlarmConfigs self = new CreateDetectConfigRequestAlarmConfigs();
            return TeaModel.build(map, self);
        }

        public CreateDetectConfigRequestAlarmConfigs setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateDetectConfigRequestAlarmConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
