// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMcpProductToolsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
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
    public ListMcpProductToolsResponseBodyData data;

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
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMcpProductToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpProductToolsResponseBody self = new ListMcpProductToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpProductToolsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMcpProductToolsResponseBody setData(ListMcpProductToolsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMcpProductToolsResponseBodyData getData() {
        return this.data;
    }

    public ListMcpProductToolsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMcpProductToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMcpProductToolsResponseBodyDataTools extends TeaModel {
        /**
         * <p>The annotation information of the tool, which is a map structure. The API definition declares it only as map<any> without specifying its members or purposes.</p>
         */
        @NameInMap("annotations")
        public java.util.Map<String, ?> annotations;

        /**
         * <p>The description of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>Functional description of the sample tool</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The input parameter structure definition of the tool, which is a map structure. The API definition declares it only as map<any> without specifying its members or constraints.</p>
         */
        @NameInMap("inputSchema")
        public java.util.Map<String, ?> inputSchema;

        /**
         * <p>The metadata information of the tool, which is a map structure. The API definition declares it only as map<any> without specifying its members or purposes.</p>
         */
        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <p>The name of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>test-tool</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The output result structure definition of the tool, which is a map structure. The API definition declares it only as map<any> without specifying its members or constraints.</p>
         */
        @NameInMap("outputSchema")
        public java.util.Map<String, ?> outputSchema;

        /**
         * <p>The title of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample tool</p>
         */
        @NameInMap("title")
        public String title;

        public static ListMcpProductToolsResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            ListMcpProductToolsResponseBodyDataTools self = new ListMcpProductToolsResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public ListMcpProductToolsResponseBodyDataTools setAnnotations(java.util.Map<String, ?> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, ?> getAnnotations() {
            return this.annotations;
        }

        public ListMcpProductToolsResponseBodyDataTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpProductToolsResponseBodyDataTools setInputSchema(java.util.Map<String, ?> inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public java.util.Map<String, ?> getInputSchema() {
            return this.inputSchema;
        }

        public ListMcpProductToolsResponseBodyDataTools setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListMcpProductToolsResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpProductToolsResponseBodyDataTools setOutputSchema(java.util.Map<String, ?> outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        public java.util.Map<String, ?> getOutputSchema() {
            return this.outputSchema;
        }

        public ListMcpProductToolsResponseBodyDataTools setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListMcpProductToolsResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP tools. Each element in the list represents an MCP tool.</p>
         */
        @NameInMap("tools")
        public java.util.List<ListMcpProductToolsResponseBodyDataTools> tools;

        public static ListMcpProductToolsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMcpProductToolsResponseBodyData self = new ListMcpProductToolsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMcpProductToolsResponseBodyData setTools(java.util.List<ListMcpProductToolsResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<ListMcpProductToolsResponseBodyDataTools> getTools() {
            return this.tools;
        }

    }

}
