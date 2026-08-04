// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetListMcpServerToolsResultResponseBody extends TeaModel {
    /**
     * <p>The MCP Server connectivity detection result. The business status is distinguished by the State field.</p>
     */
    @NameInMap("Data")
    public GetListMcpServerToolsResultResponseBodyData data;

    /**
     * <p>The return code. The value success is returned if the request succeeds. An error code is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when a system-level request failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>no mcp connect test record for session</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>550***544</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetListMcpServerToolsResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListMcpServerToolsResultResponseBody self = new GetListMcpServerToolsResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListMcpServerToolsResultResponseBody setData(GetListMcpServerToolsResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetListMcpServerToolsResultResponseBodyData getData() {
        return this.data;
    }

    public GetListMcpServerToolsResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetListMcpServerToolsResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetListMcpServerToolsResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListMcpServerToolsResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetListMcpServerToolsResultResponseBodyDataTools extends TeaModel {
        /**
         * <p>The description of the MCP tool functionality.</p>
         * 
         * <strong>example:</strong>
         * <p>query user information by user ID</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The JSON Schema string of the tool input parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;userId&quot;:{&quot;type&quot;:&quot;string&quot;}}}</p>
         */
        @NameInMap("InputSchema")
        public String inputSchema;

        /**
         * <p>The MCP tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>query_user</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetListMcpServerToolsResultResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            GetListMcpServerToolsResultResponseBodyDataTools self = new GetListMcpServerToolsResultResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public GetListMcpServerToolsResultResponseBodyDataTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetListMcpServerToolsResultResponseBodyDataTools setInputSchema(String inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public String getInputSchema() {
            return this.inputSchema;
        }

        public GetListMcpServerToolsResultResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetListMcpServerToolsResultResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the MCP Server is accessible. The value is true only when State is success.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Accessible")
        public Boolean accessible;

        /**
         * <p>The detection status. Valid values:</p>
         * <ul>
         * <li>pending: The detection is in progress.</li>
         * <li>success: The detection succeeded.</li>
         * <li>failed: The detection failed or timed out.</li>
         * </ul>
         * <p>The top-level Success field can be true in all three business states.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The list of detected MCP tools. A non-empty list is returned only when State is success.</p>
         */
        @NameInMap("Tools")
        public java.util.List<GetListMcpServerToolsResultResponseBodyDataTools> tools;

        public static GetListMcpServerToolsResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetListMcpServerToolsResultResponseBodyData self = new GetListMcpServerToolsResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetListMcpServerToolsResultResponseBodyData setAccessible(Boolean accessible) {
            this.accessible = accessible;
            return this;
        }
        public Boolean getAccessible() {
            return this.accessible;
        }

        public GetListMcpServerToolsResultResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetListMcpServerToolsResultResponseBodyData setTools(java.util.List<GetListMcpServerToolsResultResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<GetListMcpServerToolsResultResponseBodyDataTools> getTools() {
            return this.tools;
        }

    }

}
