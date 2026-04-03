// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class IMBotMetadata extends TeaModel {
    /**
     * <p>可选</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("agentRuntimeEndpointId")
    public String agentRuntimeEndpointId;

    /**
     * <p>标准模式下必填：下游 Agent 可调用的 URL；custom 模式可省略</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("agentRuntimeEndpointUrl")
    public String agentRuntimeEndpointUrl;

    /**
     * <p>绑定的 Agent Runtime UUID</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    /**
     * <p>自定义函数元信息；可选；与后端 IMBotMetadata 持久化字段一致</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("customFunctionMeta")
    public String customFunctionMeta;

    /**
     * <p>标准模式下必填，与 ValidateAgentRuntimeProtocolTypeValue 一致（大小写敏感）；custom 模式可省略</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("protocolType")
    public String protocolType;

    /**
     * <p>不写入单 Bot 持久化 JSON；用于首次/更新时设置租户级 FC RAM 执行角色 ARN（acs:ram::...）；FC 启用且非 custom 时按服务逻辑校验</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("role")
    public String role;

    public static IMBotMetadata build(java.util.Map<String, ?> map) throws Exception {
        IMBotMetadata self = new IMBotMetadata();
        return TeaModel.build(map, self);
    }

    public IMBotMetadata setAgentRuntimeEndpointId(String agentRuntimeEndpointId) {
        this.agentRuntimeEndpointId = agentRuntimeEndpointId;
        return this;
    }
    public String getAgentRuntimeEndpointId() {
        return this.agentRuntimeEndpointId;
    }

    public IMBotMetadata setAgentRuntimeEndpointUrl(String agentRuntimeEndpointUrl) {
        this.agentRuntimeEndpointUrl = agentRuntimeEndpointUrl;
        return this;
    }
    public String getAgentRuntimeEndpointUrl() {
        return this.agentRuntimeEndpointUrl;
    }

    public IMBotMetadata setAgentRuntimeId(String agentRuntimeId) {
        this.agentRuntimeId = agentRuntimeId;
        return this;
    }
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    public IMBotMetadata setCustomFunctionMeta(String customFunctionMeta) {
        this.customFunctionMeta = customFunctionMeta;
        return this;
    }
    public String getCustomFunctionMeta() {
        return this.customFunctionMeta;
    }

    public IMBotMetadata setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public IMBotMetadata setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
