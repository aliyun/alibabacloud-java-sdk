// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetMcpResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMcpResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpResponseBody self = new GetMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMcpResponseBody setData(GetMcpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMcpResponseBodyData getData() {
        return this.data;
    }

    public GetMcpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMcpResponseBodyData extends TeaModel {
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        @NameInMap("AuthConfig")
        public String authConfig;

        @NameInMap("AuthEnabled")
        public Boolean authEnabled;

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

        @NameInMap("SwaggerConfig")
        public String swaggerConfig;

        @NameInMap("Url")
        public String url;

        public static GetMcpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyData self = new GetMcpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public GetMcpResponseBodyData setAuthConfig(String authConfig) {
            this.authConfig = authConfig;
            return this;
        }
        public String getAuthConfig() {
            return this.authConfig;
        }

        public GetMcpResponseBodyData setAuthEnabled(Boolean authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }
        public Boolean getAuthEnabled() {
            return this.authEnabled;
        }

        public GetMcpResponseBodyData setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public GetMcpResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetMcpResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMcpResponseBodyData setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public GetMcpResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetMcpResponseBodyData setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public GetMcpResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
