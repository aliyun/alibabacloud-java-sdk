// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetDetectConfigResponseBody extends TeaModel {
    @NameInMap("detectConfig")
    public GetDetectConfigResponseBodyDetectConfig detectConfig;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDetectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectConfigResponseBody self = new GetDetectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectConfigResponseBody setDetectConfig(GetDetectConfigResponseBodyDetectConfig detectConfig) {
        this.detectConfig = detectConfig;
        return this;
    }
    public GetDetectConfigResponseBodyDetectConfig getDetectConfig() {
        return this.detectConfig;
    }

    public GetDetectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDetectConfigResponseBodyDetectConfigAlarmConfigs extends TeaModel {
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

        public static GetDetectConfigResponseBodyDetectConfigAlarmConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetDetectConfigResponseBodyDetectConfigAlarmConfigs self = new GetDetectConfigResponseBodyDetectConfigAlarmConfigs();
            return TeaModel.build(map, self);
        }

        public GetDetectConfigResponseBodyDetectConfigAlarmConfigs setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetDetectConfigResponseBodyDetectConfigAlarmConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDetectConfigResponseBodyDetectConfig extends TeaModel {
        @NameInMap("alarmConfigs")
        public java.util.List<GetDetectConfigResponseBodyDetectConfigAlarmConfigs> alarmConfigs;

        /**
         * <strong>example:</strong>
         * <p>2026-04-10T02:30:04Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1</p>
         */
        @NameInMap("cronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>this is a description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>dc-xxxx</p>
         */
        @NameInMap("detectConfigId")
        public String detectConfigId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("detectConfigName")
        public String detectConfigName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>Cron</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static GetDetectConfigResponseBodyDetectConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDetectConfigResponseBodyDetectConfig self = new GetDetectConfigResponseBodyDetectConfig();
            return TeaModel.build(map, self);
        }

        public GetDetectConfigResponseBodyDetectConfig setAlarmConfigs(java.util.List<GetDetectConfigResponseBodyDetectConfigAlarmConfigs> alarmConfigs) {
            this.alarmConfigs = alarmConfigs;
            return this;
        }
        public java.util.List<GetDetectConfigResponseBodyDetectConfigAlarmConfigs> getAlarmConfigs() {
            return this.alarmConfigs;
        }

        public GetDetectConfigResponseBodyDetectConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDetectConfigResponseBodyDetectConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetDetectConfigResponseBodyDetectConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDetectConfigResponseBodyDetectConfig setDetectConfigId(String detectConfigId) {
            this.detectConfigId = detectConfigId;
            return this;
        }
        public String getDetectConfigId() {
            return this.detectConfigId;
        }

        public GetDetectConfigResponseBodyDetectConfig setDetectConfigName(String detectConfigName) {
            this.detectConfigName = detectConfigName;
            return this;
        }
        public String getDetectConfigName() {
            return this.detectConfigName;
        }

        public GetDetectConfigResponseBodyDetectConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetDetectConfigResponseBodyDetectConfig setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
