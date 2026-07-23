// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    /**
     * <p>The description of the event bus.</p>
     * 
     * <strong>example:</strong>
     * <p>连接配置描述信息</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The associated metadata.</p>
     */
    @NameInMap("Metadata")
    public CreateAgentRequestMetadata metadata;

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
     * <p>You are an IoT data analytics assistant...</p>
     * 
     * <strong>example:</strong>
     * <p>我想要她，你这样增加请求头获取用户IP CF-Connecting-IP%3B</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentRequest setMetadata(CreateAgentRequestMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public CreateAgentRequestMetadata getMetadata() {
        return this.metadata;
    }

    public CreateAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public static class CreateAgentRequestMetadataAttachments extends TeaModel {
        /**
         * <p>The ARN of the attached metadata object.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:12345:eventhouse/system-rocketmq/namespace/rmq-cn-XXX/table/order</p>
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

        public static CreateAgentRequestMetadataAttachments build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentRequestMetadataAttachments self = new CreateAgentRequestMetadataAttachments();
            return TeaModel.build(map, self);
        }

        public CreateAgentRequestMetadataAttachments setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateAgentRequestMetadataAttachments setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

    }

    public static class CreateAgentRequestMetadata extends TeaModel {
        /**
         * <p>The array of attached metadata objects.</p>
         */
        @NameInMap("Attachments")
        public java.util.List<CreateAgentRequestMetadataAttachments> attachments;

        public static CreateAgentRequestMetadata build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentRequestMetadata self = new CreateAgentRequestMetadata();
            return TeaModel.build(map, self);
        }

        public CreateAgentRequestMetadata setAttachments(java.util.List<CreateAgentRequestMetadataAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<CreateAgentRequestMetadataAttachments> getAttachments() {
            return this.attachments;
        }

    }

}
