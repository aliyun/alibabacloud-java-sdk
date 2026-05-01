// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ConfigRuntimeChannelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk-connector</p>
     */
    @NameInMap("Code")
    public String code;

    /**
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

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeIds")
    public java.util.List<String> runtimeIds;

    /**
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
