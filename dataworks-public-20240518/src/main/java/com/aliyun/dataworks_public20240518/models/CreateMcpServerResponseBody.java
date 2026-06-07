// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMcpServerResponseBody extends TeaModel {
    @NameInMap("McpServer")
    public CreateMcpServerResponseBodyMcpServer mcpServer;

    /**
     * <strong>example:</strong>
     * <p>valueA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServerResponseBody self = new CreateMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcpServerResponseBody setMcpServer(CreateMcpServerResponseBodyMcpServer mcpServer) {
        this.mcpServer = mcpServer;
        return this;
    }
    public CreateMcpServerResponseBodyMcpServer getMcpServer() {
        return this.mcpServer;
    }

    public CreateMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMcpServerResponseBodyMcpServer extends TeaModel {
        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateMcpServerResponseBodyMcpServer build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerResponseBodyMcpServer self = new CreateMcpServerResponseBodyMcpServer();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerResponseBodyMcpServer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public CreateMcpServerResponseBodyMcpServer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
