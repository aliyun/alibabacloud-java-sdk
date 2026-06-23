// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PromptAgentSessionRequest extends TeaModel {
    /**
     * <p>The ID passed in by the caller. The value is returned as-is in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>1021418411</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed value: 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameters.</p>
     */
    @NameInMap("Params")
    public PromptAgentSessionRequestParams params;

    public static PromptAgentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        PromptAgentSessionRequest self = new PromptAgentSessionRequest();
        return TeaModel.build(map, self);
    }

    public PromptAgentSessionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PromptAgentSessionRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public PromptAgentSessionRequest setParams(PromptAgentSessionRequestParams params) {
        this.params = params;
        return this;
    }
    public PromptAgentSessionRequestParams getParams() {
        return this.params;
    }

    public static class PromptAgentSessionRequestParamsMeta extends TeaModel {
        /**
         * <p>A Map-type value. In custom agent scenarios, you can use this parameter to replace placeholder parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *    &quot;key1&quot;: &quot;value1&quot;,
         *    &quot;key2&quot;: &quot;value2&quot;
         * }</p>
         */
        @NameInMap("Context")
        public Object context;

        public static PromptAgentSessionRequestParamsMeta build(java.util.Map<String, ?> map) throws Exception {
            PromptAgentSessionRequestParamsMeta self = new PromptAgentSessionRequestParamsMeta();
            return TeaModel.build(map, self);
        }

        public PromptAgentSessionRequestParamsMeta setContext(Object context) {
            this.context = context;
            return this;
        }
        public Object getContext() {
            return this.context;
        }

    }

    public static class PromptAgentSessionRequestParamsPromptMeta extends TeaModel {
        /**
         * <p>Specifies whether to hide the prompt from the user. For example, if a user asks &quot;Sales amount in the last 7 days&quot; in a chat dialog, the calling system may use RAG to retrieve relevant business domain knowledge and append it to the agent context before calling the API. If you do not want to display this supplemental information to the user, set this parameter to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true or false</p>
         */
        @NameInMap("Hide")
        public Boolean hide;

        public static PromptAgentSessionRequestParamsPromptMeta build(java.util.Map<String, ?> map) throws Exception {
            PromptAgentSessionRequestParamsPromptMeta self = new PromptAgentSessionRequestParamsPromptMeta();
            return TeaModel.build(map, self);
        }

        public PromptAgentSessionRequestParamsPromptMeta setHide(Boolean hide) {
            this.hide = hide;
            return this;
        }
        public Boolean getHide() {
            return this.hide;
        }

    }

    public static class PromptAgentSessionRequestParamsPrompt extends TeaModel {
        /**
         * <p>The description of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales_Order_Details.csv</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The prompt metadata extended by DataWorks.</p>
         */
        @NameInMap("Meta")
        public PromptAgentSessionRequestParamsPromptMeta meta;

        /**
         * <p>The MIME type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>text/csv‌</p>
         */
        @NameInMap("MimeType")
        public String mimeType;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.csv</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1231231</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p><strong>The text content.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>Sales in the last 7 days</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The title of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales_Order_Details.csv</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p><strong>The content block type.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URI of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://${bucket}/${ossKey}</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static PromptAgentSessionRequestParamsPrompt build(java.util.Map<String, ?> map) throws Exception {
            PromptAgentSessionRequestParamsPrompt self = new PromptAgentSessionRequestParamsPrompt();
            return TeaModel.build(map, self);
        }

        public PromptAgentSessionRequestParamsPrompt setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PromptAgentSessionRequestParamsPrompt setMeta(PromptAgentSessionRequestParamsPromptMeta meta) {
            this.meta = meta;
            return this;
        }
        public PromptAgentSessionRequestParamsPromptMeta getMeta() {
            return this.meta;
        }

        public PromptAgentSessionRequestParamsPrompt setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public PromptAgentSessionRequestParamsPrompt setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PromptAgentSessionRequestParamsPrompt setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public PromptAgentSessionRequestParamsPrompt setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public PromptAgentSessionRequestParamsPrompt setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PromptAgentSessionRequestParamsPrompt setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PromptAgentSessionRequestParamsPrompt setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class PromptAgentSessionRequestParams extends TeaModel {
        /**
         * <p>The extended metadata.</p>
         */
        @NameInMap("Meta")
        public PromptAgentSessionRequestParamsMeta meta;

        /**
         * <p>The array of user message content blocks. For more information, see https\://agentclientprotocol.com/protocol/content</p>
         */
        @NameInMap("Prompt")
        public java.util.List<PromptAgentSessionRequestParamsPrompt> prompt;

        /**
         * <p>The ID of the target session. If the session does not exist, an SSE error frame is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static PromptAgentSessionRequestParams build(java.util.Map<String, ?> map) throws Exception {
            PromptAgentSessionRequestParams self = new PromptAgentSessionRequestParams();
            return TeaModel.build(map, self);
        }

        public PromptAgentSessionRequestParams setMeta(PromptAgentSessionRequestParamsMeta meta) {
            this.meta = meta;
            return this;
        }
        public PromptAgentSessionRequestParamsMeta getMeta() {
            return this.meta;
        }

        public PromptAgentSessionRequestParams setPrompt(java.util.List<PromptAgentSessionRequestParamsPrompt> prompt) {
            this.prompt = prompt;
            return this;
        }
        public java.util.List<PromptAgentSessionRequestParamsPrompt> getPrompt() {
            return this.prompt;
        }

        public PromptAgentSessionRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
