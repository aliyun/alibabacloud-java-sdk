// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateAgentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TF-CreateRule-1652253755-aa33f762-7e99-4aee-bd27-d3370afa5625</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Metadata")
    public UpdateAgentRequestMetadata metadata;

    /**
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

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
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:12345:eventhouse/system-rocketmq/namespace/rmq-cn-xxx/table/order</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
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
