// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateMcpServerResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>object</p>
     */
    @NameInMap("data")
    public CreateMcpServerResponseBodyData data;

    /**
     * <p>message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>464F9EA0-1052-51BD-8187-D292AA2D8D24</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServerResponseBody self = new CreateMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcpServerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMcpServerResponseBody setData(CreateMcpServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMcpServerResponseBodyData getData() {
        return this.data;
    }

    public CreateMcpServerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMcpServerResponseBodyData extends TeaModel {
        /**
         * <p>MCP Server ID</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-afegaijoijaoji24a</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>MCP server name</p>
         * 
         * <strong>example:</strong>
         * <p>test-mcp</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateMcpServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerResponseBodyData self = new CreateMcpServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerResponseBodyData setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public CreateMcpServerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
