// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateMcpResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateMcpResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpResponseBody self = new CreateMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMcpResponseBody setData(CreateMcpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMcpResponseBodyData getData() {
        return this.data;
    }

    public CreateMcpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMcpResponseBodyData extends TeaModel {
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("DeployStatus")
        public String deployStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("McpServerConfig")
        public String mcpServerConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("Protocol")
        public String protocol;

        public static CreateMcpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyData self = new CreateMcpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public CreateMcpResponseBodyData setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public CreateMcpResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public CreateMcpResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMcpResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMcpResponseBodyData setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public CreateMcpResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
