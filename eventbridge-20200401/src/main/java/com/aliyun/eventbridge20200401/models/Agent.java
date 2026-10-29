// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Agent extends TeaModel {
    /**
     * <p>The creation time in UNIX milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717200000000</p>
     */
    @NameInMap("CreatedAt")
    public Long createdAt;

    /**
     * <p>The description of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>IoT device data query agent</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the MCP server associated with the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>8vHW4mDRxxxxx</p>
     */
    @NameInMap("McpServerId")
    public String mcpServerId;

    /**
     * <p>The name of the MCP server.</p>
     * 
     * <strong>example:</strong>
     * <p>data-analyze-agent</p>
     */
    @NameInMap("McpServerName")
    public String mcpServerName;

    /**
     * <p>The associated table metadata.</p>
     */
    @NameInMap("Metadata")
    public Metadata metadata;

    /**
     * <p>The name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The custom prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>You are an IoT data analytics assistant...</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The update time in UNIX milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717200000000</p>
     */
    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static Agent build(java.util.Map<String, ?> map) throws Exception {
        Agent self = new Agent();
        return TeaModel.build(map, self);
    }

    public Agent setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Agent setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Agent setMcpServerId(String mcpServerId) {
        this.mcpServerId = mcpServerId;
        return this;
    }
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    public Agent setMcpServerName(String mcpServerName) {
        this.mcpServerName = mcpServerName;
        return this;
    }
    public String getMcpServerName() {
        return this.mcpServerName;
    }

    public Agent setMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public Metadata getMetadata() {
        return this.metadata;
    }

    public Agent setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Agent setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public Agent setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
