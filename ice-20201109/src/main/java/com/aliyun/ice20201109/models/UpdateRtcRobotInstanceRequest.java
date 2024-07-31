// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateRtcRobotInstanceRequest extends TeaModel {
    @NameInMap("Config")
    public UpdateRtcRobotInstanceRequestConfig config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>727dc0e296014bb58670940a3da95592</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateRtcRobotInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcRobotInstanceRequest self = new UpdateRtcRobotInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRtcRobotInstanceRequest setConfig(UpdateRtcRobotInstanceRequestConfig config) {
        this.config = config;
        return this;
    }
    public UpdateRtcRobotInstanceRequestConfig getConfig() {
        return this.config;
    }

    public UpdateRtcRobotInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class UpdateRtcRobotInstanceRequestConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("Greeting")
        public String greeting;

        /**
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        public static UpdateRtcRobotInstanceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRtcRobotInstanceRequestConfig self = new UpdateRtcRobotInstanceRequestConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRtcRobotInstanceRequestConfig setEnableVoiceInterrupt(Boolean enableVoiceInterrupt) {
            this.enableVoiceInterrupt = enableVoiceInterrupt;
            return this;
        }
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        public UpdateRtcRobotInstanceRequestConfig setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
        }

        public UpdateRtcRobotInstanceRequestConfig setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

    }

}
