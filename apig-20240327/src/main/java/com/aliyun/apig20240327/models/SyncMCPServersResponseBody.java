// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SyncMCPServersResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public SyncMCPServersResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F46B9E7-67EF-5C8A-BA52-D38D5B32AF2C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SyncMCPServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncMCPServersResponseBody self = new SyncMCPServersResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncMCPServersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncMCPServersResponseBody setData(SyncMCPServersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncMCPServersResponseBodyData getData() {
        return this.data;
    }

    public SyncMCPServersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncMCPServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SyncMCPServersResponseBodyDataFailedMcpServers extends TeaModel {
        /**
         * <p>The name of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-fail</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

        /**
         * <p>The protocol.</p>
         */
        @NameInMap("protocols")
        public java.util.List<String> protocols;

        public static SyncMCPServersResponseBodyDataFailedMcpServers build(java.util.Map<String, ?> map) throws Exception {
            SyncMCPServersResponseBodyDataFailedMcpServers self = new SyncMCPServersResponseBodyDataFailedMcpServers();
            return TeaModel.build(map, self);
        }

        public SyncMCPServersResponseBodyDataFailedMcpServers setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public SyncMCPServersResponseBodyDataFailedMcpServers setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

    }

    public static class SyncMCPServersResponseBodyDataSucceedMcpServers extends TeaModel {
        /**
         * <p>The name of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-success</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

        /**
         * <p>The protocol.</p>
         */
        @NameInMap("protocols")
        public java.util.List<String> protocols;

        public static SyncMCPServersResponseBodyDataSucceedMcpServers build(java.util.Map<String, ?> map) throws Exception {
            SyncMCPServersResponseBodyDataSucceedMcpServers self = new SyncMCPServersResponseBodyDataSucceedMcpServers();
            return TeaModel.build(map, self);
        }

        public SyncMCPServersResponseBodyDataSucceedMcpServers setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public SyncMCPServersResponseBodyDataSucceedMcpServers setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

    }

    public static class SyncMCPServersResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP servers that failed to synchronize.</p>
         */
        @NameInMap("failedMcpServers")
        public java.util.List<SyncMCPServersResponseBodyDataFailedMcpServers> failedMcpServers;

        /**
         * <p>The list of MCP servers successfully synchronized.</p>
         */
        @NameInMap("succeedMcpServers")
        public java.util.List<SyncMCPServersResponseBodyDataSucceedMcpServers> succeedMcpServers;

        public static SyncMCPServersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncMCPServersResponseBodyData self = new SyncMCPServersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncMCPServersResponseBodyData setFailedMcpServers(java.util.List<SyncMCPServersResponseBodyDataFailedMcpServers> failedMcpServers) {
            this.failedMcpServers = failedMcpServers;
            return this;
        }
        public java.util.List<SyncMCPServersResponseBodyDataFailedMcpServers> getFailedMcpServers() {
            return this.failedMcpServers;
        }

        public SyncMCPServersResponseBodyData setSucceedMcpServers(java.util.List<SyncMCPServersResponseBodyDataSucceedMcpServers> succeedMcpServers) {
            this.succeedMcpServers = succeedMcpServers;
            return this;
        }
        public java.util.List<SyncMCPServersResponseBodyDataSucceedMcpServers> getSucceedMcpServers() {
            return this.succeedMcpServers;
        }

    }

}
