// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPluginClassResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetPluginClassResponseBodyData data;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("alias")
        public String alias;

        @NameInMap("description")
        public String description;

        @NameInMap("document")
        public String document;

        @NameInMap("name")
        public String name;

        @NameInMap("publishStatus")
        public String publishStatus;

        @NameInMap("type")
        public String type;

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
