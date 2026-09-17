// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220602.models;

import com.aliyun.tea.*;

public class PromptAgentSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>product=HOLOGRES</p>
     */
    @NameInMap("Caller-Context")
    public String callerContext;

    /**
     * <strong>example:</strong>
     * <p>2072736942627512345</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    @NameInMap("Params")
    public PromptAgentSessionRequestParams params;

    public static PromptAgentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        PromptAgentSessionRequest self = new PromptAgentSessionRequest();
        return TeaModel.build(map, self);
    }

    public PromptAgentSessionRequest setCallerContext(String callerContext) {
        this.callerContext = callerContext;
        return this;
    }
    public String getCallerContext() {
        return this.callerContext;
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
         * <strong>example:</strong>
         * <p>{ &quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot; }</p>
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
         * <strong>example:</strong>
         * <p>false</p>
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
         * <strong>example:</strong>
         * <p>User\&quot;s order details</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Meta")
        public PromptAgentSessionRequestParamsPromptMeta meta;

        /**
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("MimeType")
        public String mimeType;

        /**
         * <strong>example:</strong>
         * <p>xxx.csv</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2048000</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>How many skills do you have?</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>user_orders</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
        @NameInMap("Meta")
        public PromptAgentSessionRequestParamsMeta meta;

        @NameInMap("Prompt")
        public java.util.List<PromptAgentSessionRequestParamsPrompt> prompt;

        /**
         * <strong>example:</strong>
         * <p>046d002e-0c68-4fa2-9fd8-341d9b85afb7</p>
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
