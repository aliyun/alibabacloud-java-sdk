// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateAgentRequest extends TeaModel {
    /**
     * <p>The client-generated request token. This parameter is used to ensure the idempotence of the request. The token must be unique across different requests and can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>TF-CreateRule-1652253755-aa33f762-7e99-4aee-bd27-d3370afa5625</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>Filtering rule for MNS</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the MCP server bound to the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>bGXX51ULuGl10xrr</p>
     */
    @NameInMap("McpServerId")
    public String mcpServerId;

    /**
     * <p>The name of the MCP server bound to the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>eventhouse-agentbridge</p>
     */
    @NameInMap("McpServerName")
    public String mcpServerName;

    /**
     * <p>The associated metadata.</p>
     */
    @NameInMap("Metadata")
    public UpdateAgentRequestMetadata metadata;

    /**
     * <p>The name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The prompt for the agent, such as &quot;You are an IoT data analytics assistant...&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>瑞士冻结马杜罗在瑞资产</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    public static UpdateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRequest self = new UpdateAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAgentRequest setMcpServerId(String mcpServerId) {
        this.mcpServerId = mcpServerId;
        return this;
    }
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    public UpdateAgentRequest setMcpServerName(String mcpServerName) {
        this.mcpServerName = mcpServerName;
        return this;
    }
    public String getMcpServerName() {
        return this.mcpServerName;
    }

    public UpdateAgentRequest setMetadata(UpdateAgentRequestMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public UpdateAgentRequestMetadata getMetadata() {
        return this.metadata;
    }

    public UpdateAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAgentRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public static class UpdateAgentRequestMetadataAttachments extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the bound metadata object.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:12345:eventhouse/system-rocketmq/namespace/rmq-cn-xxx/table/order</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The object type of the attached metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>inner-resource/event-table</p>
         */
        @NameInMap("MimeType")
        public String mimeType;

        public static UpdateAgentRequestMetadataAttachments build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentRequestMetadataAttachments self = new UpdateAgentRequestMetadataAttachments();
            return TeaModel.build(map, self);
        }

        public UpdateAgentRequestMetadataAttachments setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public UpdateAgentRequestMetadataAttachments setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

    }

    public static class UpdateAgentRequestMetadata extends TeaModel {
        /**
         * <p>The bound metadata objects.</p>
         */
        @NameInMap("Attachments")
        public java.util.List<UpdateAgentRequestMetadataAttachments> attachments;

        public static UpdateAgentRequestMetadata build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentRequestMetadata self = new UpdateAgentRequestMetadata();
            return TeaModel.build(map, self);
        }

        public UpdateAgentRequestMetadata setAttachments(java.util.List<UpdateAgentRequestMetadataAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<UpdateAgentRequestMetadataAttachments> getAttachments() {
            return this.attachments;
        }

    }

}
