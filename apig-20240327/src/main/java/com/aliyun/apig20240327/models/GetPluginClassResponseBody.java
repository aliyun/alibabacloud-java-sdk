// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPluginClassResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetPluginClassResponseBodyData data;

    /**
     * <p>The response message.</p>
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
     * <p>29D8B6AE-326F-51AA-83F8-CC00DAF513F8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPluginClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPluginClassResponseBody self = new GetPluginClassResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPluginClassResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPluginClassResponseBody setData(GetPluginClassResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPluginClassResponseBodyData getData() {
        return this.data;
    }

    public GetPluginClassResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPluginClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPluginClassResponseBodyData extends TeaModel {
        /**
         * <p>The plug-in alias.</p>
         * 
         * <strong>example:</strong>
         * <p>Key Auth</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The plug-in description.</p>
         * 
         * <strong>example:</strong>
         * <p>Authentication based on API Key</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The document key.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-key-auth</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>The plug-in name.</p>
         * 
         * <strong>example:</strong>
         * <p>key-auth</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The publish status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("publishStatus")
        public String publishStatus;

        /**
         * <p>The plug-in type.</p>
         * 
         * <strong>example:</strong>
         * <p>Auth</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The Wasm plug-in programming language.</p>
         * 
         * <strong>example:</strong>
         * <p>TinyGo</p>
         */
        @NameInMap("wasmLanguage")
        public String wasmLanguage;

        public static GetPluginClassResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPluginClassResponseBodyData self = new GetPluginClassResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPluginClassResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetPluginClassResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPluginClassResponseBodyData setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public GetPluginClassResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPluginClassResponseBodyData setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public GetPluginClassResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetPluginClassResponseBodyData setWasmLanguage(String wasmLanguage) {
            this.wasmLanguage = wasmLanguage;
            return this;
        }
        public String getWasmLanguage() {
            return this.wasmLanguage;
        }

    }

}
