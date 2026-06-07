// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMcpServerResponseBody extends TeaModel {
    @NameInMap("McpServer")
    public UpdateMcpServerResponseBodyMcpServer mcpServer;

    /**
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpServerResponseBody self = new UpdateMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMcpServerResponseBody setMcpServer(UpdateMcpServerResponseBodyMcpServer mcpServer) {
        this.mcpServer = mcpServer;
        return this;
    }
    public UpdateMcpServerResponseBodyMcpServer getMcpServer() {
        return this.mcpServer;
    }

    public UpdateMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateMcpServerResponseBodyMcpServer extends TeaModel {
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
         * <p>my-mcp-server</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateMcpServerResponseBodyMcpServer build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerResponseBodyMcpServer self = new UpdateMcpServerResponseBodyMcpServer();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerResponseBodyMcpServer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public UpdateMcpServerResponseBodyMcpServer setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public UpdateMcpServerResponseBodyMcpServer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
