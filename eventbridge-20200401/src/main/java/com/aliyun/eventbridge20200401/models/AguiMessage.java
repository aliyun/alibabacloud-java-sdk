// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AguiMessage extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Id")
    public String id;

    @NameInMap("Metadata")
    public AguiMessageMetadata metadata;

    @NameInMap("Role")
    public String role;

    @NameInMap("ToolCallId")
    public String toolCallId;

    @NameInMap("ToolCalls")
    public java.util.List<AguiMessageToolCalls> toolCalls;

    public static AguiMessage build(java.util.Map<String, ?> map) throws Exception {
        AguiMessage self = new AguiMessage();
        return TeaModel.build(map, self);
    }

    public AguiMessage setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AguiMessage setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AguiMessage setMetadata(AguiMessageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public AguiMessageMetadata getMetadata() {
        return this.metadata;
    }

    public AguiMessage setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public AguiMessage setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }
    public String getToolCallId() {
        return this.toolCallId;
    }

    public AguiMessage setToolCalls(java.util.List<AguiMessageToolCalls> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }
    public java.util.List<AguiMessageToolCalls> getToolCalls() {
        return this.toolCalls;
    }

    public static class AguiMessageMetadataAttachments extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static AguiMessageMetadataAttachments build(java.util.Map<String, ?> map) throws Exception {
            AguiMessageMetadataAttachments self = new AguiMessageMetadataAttachments();
            return TeaModel.build(map, self);
        }

        public AguiMessageMetadataAttachments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AguiMessageMetadataAttachments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AguiMessageMetadata extends TeaModel {
        @NameInMap("Attachments")
        public AguiMessageMetadataAttachments attachments;

        public static AguiMessageMetadata build(java.util.Map<String, ?> map) throws Exception {
            AguiMessageMetadata self = new AguiMessageMetadata();
            return TeaModel.build(map, self);
        }

        public AguiMessageMetadata setAttachments(AguiMessageMetadataAttachments attachments) {
            this.attachments = attachments;
            return this;
        }
        public AguiMessageMetadataAttachments getAttachments() {
            return this.attachments;
        }

    }

    public static class AguiMessageToolCallsFunction extends TeaModel {
        @NameInMap("Arguments")
        public String arguments;

        @NameInMap("Name")
        public String name;

        public static AguiMessageToolCallsFunction build(java.util.Map<String, ?> map) throws Exception {
            AguiMessageToolCallsFunction self = new AguiMessageToolCallsFunction();
            return TeaModel.build(map, self);
        }

        public AguiMessageToolCallsFunction setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public AguiMessageToolCallsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AguiMessageToolCalls extends TeaModel {
        @NameInMap("Function")
        public AguiMessageToolCallsFunction function;

        @NameInMap("Id")
        public String id;

        @NameInMap("Type")
        public String type;

        public static AguiMessageToolCalls build(java.util.Map<String, ?> map) throws Exception {
            AguiMessageToolCalls self = new AguiMessageToolCalls();
            return TeaModel.build(map, self);
        }

        public AguiMessageToolCalls setFunction(AguiMessageToolCallsFunction function) {
            this.function = function;
            return this;
        }
        public AguiMessageToolCallsFunction getFunction() {
            return this.function;
        }

        public AguiMessageToolCalls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AguiMessageToolCalls setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
