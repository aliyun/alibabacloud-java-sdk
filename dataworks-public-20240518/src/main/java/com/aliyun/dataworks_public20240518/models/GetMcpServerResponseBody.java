// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMcpServerResponseBody extends TeaModel {
    @NameInMap("McpServer")
    public GetMcpServerResponseBodyMcpServer mcpServer;

    /**
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpServerResponseBody self = new GetMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpServerResponseBody setMcpServer(GetMcpServerResponseBodyMcpServer mcpServer) {
        this.mcpServer = mcpServer;
        return this;
    }
    public GetMcpServerResponseBodyMcpServer getMcpServer() {
        return this.mcpServer;
    }

    public GetMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMcpServerResponseBodyMcpServerConfig extends TeaModel {
        @NameInMap("CustomHeaders")
        public java.util.Map<String, ?> customHeaders;

        /**
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("Transport")
        public String transport;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp/sse">https://example.com/mcp/sse</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMcpServerResponseBodyMcpServerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyMcpServerConfig self = new GetMcpServerResponseBodyMcpServerConfig();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyMcpServerConfig setCustomHeaders(java.util.Map<String, ?> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public java.util.Map<String, ?> getCustomHeaders() {
            return this.customHeaders;
        }

        public GetMcpServerResponseBodyMcpServerConfig setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

        public GetMcpServerResponseBodyMcpServerConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMcpServerResponseBodyMcpServer extends TeaModel {
        @NameInMap("Config")
        public GetMcpServerResponseBodyMcpServerConfig config;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Visibility")
        public String visibility;

        public static GetMcpServerResponseBodyMcpServer build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyMcpServer self = new GetMcpServerResponseBodyMcpServer();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyMcpServer setConfig(GetMcpServerResponseBodyMcpServerConfig config) {
            this.config = config;
            return this;
        }
        public GetMcpServerResponseBodyMcpServerConfig getConfig() {
            return this.config;
        }

        public GetMcpServerResponseBodyMcpServer setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetMcpServerResponseBodyMcpServer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetMcpServerResponseBodyMcpServer setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetMcpServerResponseBodyMcpServer setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetMcpServerResponseBodyMcpServer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpServerResponseBodyMcpServer setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

}
