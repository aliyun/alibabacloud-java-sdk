// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ConfigRuntimeChannelRequest extends TeaModel {
    /**
     * <p>The Agent platform (such as ENTERPRISE or JVS).</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The Agent provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The third-party channel code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk-connector</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The channel configuration JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;appKey&quot;: &quot;abc&quot;,
     *     &quot;appSecret&quot;: &quot;efg&quot;
     * }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The configuration mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Simple</p>
     */
    @NameInMap("ConfigMode")
    public String configMode;

    /**
     * <p>The channel name.</p>
     * <p>If you leave this parameter empty, the system automatically uses the value of Code as the name.</p>
     * 
     * <strong>example:</strong>
     * <p>钉钉</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of runtime IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeIds")
    public java.util.List<String> runtimeIds;

    /**
     * <p>The Agent runtime type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("RuntimeType")
    public String runtimeType;

    public static ConfigRuntimeChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigRuntimeChannelRequest self = new ConfigRuntimeChannelRequest();
        return TeaModel.build(map, self);
    }

    public ConfigRuntimeChannelRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public ConfigRuntimeChannelRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public ConfigRuntimeChannelRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfigRuntimeChannelRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ConfigRuntimeChannelRequest setConfigMode(String configMode) {
        this.configMode = configMode;
        return this;
    }
    public String getConfigMode() {
        return this.configMode;
    }

    public ConfigRuntimeChannelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigRuntimeChannelRequest setRuntimeIds(java.util.List<String> runtimeIds) {
        this.runtimeIds = runtimeIds;
        return this;
    }
    public java.util.List<String> getRuntimeIds() {
        return this.runtimeIds;
    }

    public ConfigRuntimeChannelRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

}
