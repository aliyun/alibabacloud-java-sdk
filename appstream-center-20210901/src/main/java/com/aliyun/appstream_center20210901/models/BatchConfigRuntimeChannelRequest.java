// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BatchConfigRuntimeChannelRequest extends TeaModel {
    /**
     * <p>The agent platform, such as ENTERPRISE. If the value is invalid, the error code InvalidParameter.AgentPlatform is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The agent provider.</p>
     * <ul>
     * <li>JVS Computer: Specify OpenClaw.</li>
     * <li>OpenClaw: Specify OpenClaw.</li>
     * <li>Hermes Agent: Specify HermesAgent.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The list of channel configurations. A maximum of 200 items are supported. Each configuration item specifies an agent runtime and the third-party channel to be configured for it. Different channel configurations can be delivered to different runtimes. Multiple configuration items for the same runtime are processed sequentially.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelConfigs")
    public java.util.List<BatchConfigRuntimeChannelRequestChannelConfigs> channelConfigs;

    /**
     * <p>The agent runtime type, such as CloudDesktop (Cloud Desktop).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("RuntimeType")
    public String runtimeType;

    public static BatchConfigRuntimeChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchConfigRuntimeChannelRequest self = new BatchConfigRuntimeChannelRequest();
        return TeaModel.build(map, self);
    }

    public BatchConfigRuntimeChannelRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public BatchConfigRuntimeChannelRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public BatchConfigRuntimeChannelRequest setChannelConfigs(java.util.List<BatchConfigRuntimeChannelRequestChannelConfigs> channelConfigs) {
        this.channelConfigs = channelConfigs;
        return this;
    }
    public java.util.List<BatchConfigRuntimeChannelRequestChannelConfigs> getChannelConfigs() {
        return this.channelConfigs;
    }

    public BatchConfigRuntimeChannelRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public static class BatchConfigRuntimeChannelRequestChannelConfigs extends TeaModel {
        /**
         * <p>The third-party channel code, such as dingtalk-connector (DingTalk), feishu (Lark), and wecom (WeCom). System channel codes are case-insensitive. Configuring wechat and jvsclaw is not supported. If these values are passed, the entire request fails and the error code ChannelConfig.NotSupported is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk-connector</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The JSON string for channel configuration.</p>
         * <ul>
         * <li>Simple mode: only appKey and appSecret are allowed.</li>
         * <li>Custom mode: all configuration items required for the channel under the current agent provider must be included.</li>
         * </ul>
         * <p>If the string is not valid JSON, the error code InvalidParameter.ValueInvalid is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appKey&quot;:&quot;testKey&quot;,&quot;appSecret&quot;:&quot;testSecret&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The configuration mode. Valid values:</p>
         * <ul>
         * <li>Simple: simple configuration mode.</li>
         * <li>Custom: custom configuration mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Simple</p>
         */
        @NameInMap("ConfigMode")
        public String configMode;

        /**
         * <p>The channel name.</p>
         * <p>If this parameter is not specified, the system automatically uses the code as the name.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The agent runtime ID. The ID mappings are as follows:</p>
         * <ul>
         * <li>JVS Computer: the JVS Computer ID, in the format of jvs-xxxx.</li>
         * <li>OpenClaw: the cloud desktop ID, in the format of ecd-xxxx.</li>
         * <li>Hermes Agent: the Hermes Agent ID, in the format of jvs-xxxx.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xgads</p>
         */
        @NameInMap("RuntimeId")
        public String runtimeId;

        public static BatchConfigRuntimeChannelRequestChannelConfigs build(java.util.Map<String, ?> map) throws Exception {
            BatchConfigRuntimeChannelRequestChannelConfigs self = new BatchConfigRuntimeChannelRequestChannelConfigs();
            return TeaModel.build(map, self);
        }

        public BatchConfigRuntimeChannelRequestChannelConfigs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchConfigRuntimeChannelRequestChannelConfigs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public BatchConfigRuntimeChannelRequestChannelConfigs setConfigMode(String configMode) {
            this.configMode = configMode;
            return this;
        }
        public String getConfigMode() {
            return this.configMode;
        }

        public BatchConfigRuntimeChannelRequestChannelConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchConfigRuntimeChannelRequestChannelConfigs setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

    }

}
