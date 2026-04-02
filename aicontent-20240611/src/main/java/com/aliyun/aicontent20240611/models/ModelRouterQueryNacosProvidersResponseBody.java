// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryNacosProvidersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<ModelRouterQueryNacosProvidersResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterQueryNacosProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryNacosProvidersResponseBody self = new ModelRouterQueryNacosProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryNacosProvidersResponseBody setData(java.util.List<ModelRouterQueryNacosProvidersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ModelRouterQueryNacosProvidersResponseBodyData> getData() {
        return this.data;
    }

    public ModelRouterQueryNacosProvidersResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryNacosProvidersResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryNacosProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryNacosProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryNacosProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryNacosProvidersResponseBodyDataModelsExtensions extends TeaModel {
        @NameInMap("async")
        public Boolean async;

        public static ModelRouterQueryNacosProvidersResponseBodyDataModelsExtensions build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryNacosProvidersResponseBodyDataModelsExtensions self = new ModelRouterQueryNacosProvidersResponseBodyDataModelsExtensions();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryNacosProvidersResponseBodyDataModelsExtensions setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

    }

    public static class ModelRouterQueryNacosProvidersResponseBodyDataModels extends TeaModel {
        @NameInMap("extensions")
        public ModelRouterQueryNacosProvidersResponseBodyDataModelsExtensions extensions;

        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("inOut")
        public String inOut;

        @NameInMap("inputToken")
        public String inputToken;

        @NameInMap("outputToken")
        public String outputToken;

        /**
         * <strong>example:</strong>
         * <p>Chat</p>
         */
        @NameInMap("type")
        public String type;

        public static ModelRouterQueryNacosProvidersResponseBodyDataModels build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryNacosProvidersResponseBodyDataModels self = new ModelRouterQueryNacosProvidersResponseBodyDataModels();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryNacosProvidersResponseBodyDataModels setExtensions(ModelRouterQueryNacosProvidersResponseBodyDataModelsExtensions extensions) {
            this.extensions = extensions;
            return this;
        }
        public ModelRouterQueryNacosProvidersResponseBodyDataModelsExtensions getExtensions() {
            return this.extensions;
        }

        public ModelRouterQueryNacosProvidersResponseBodyDataModels setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ModelRouterQueryNacosProvidersResponseBodyDataModels setInOut(String inOut) {
            this.inOut = inOut;
            return this;
        }
        public String getInOut() {
            return this.inOut;
        }

        public ModelRouterQueryNacosProvidersResponseBodyDataModels setInputToken(String inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public String getInputToken() {
            return this.inputToken;
        }

        public ModelRouterQueryNacosProvidersResponseBodyDataModels setOutputToken(String outputToken) {
            this.outputToken = outputToken;
            return this;
        }
        public String getOutputToken() {
            return this.outputToken;
        }

        public ModelRouterQueryNacosProvidersResponseBodyDataModels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModelRouterQueryNacosProvidersResponseBodyData extends TeaModel {
        @NameInMap("baseUrl")
        public String baseUrl;

        @NameInMap("models")
        public java.util.List<ModelRouterQueryNacosProvidersResponseBodyDataModels> models;

        @NameInMap("name")
        public String name;

        @NameInMap("symbol")
        public String symbol;

        public static ModelRouterQueryNacosProvidersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryNacosProvidersResponseBodyData self = new ModelRouterQueryNacosProvidersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryNacosProvidersResponseBodyData setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public ModelRouterQueryNacosProvidersResponseBodyData setModels(java.util.List<ModelRouterQueryNacosProvidersResponseBodyDataModels> models) {
            this.models = models;
            return this;
        }
        public java.util.List<ModelRouterQueryNacosProvidersResponseBodyDataModels> getModels() {
            return this.models;
        }

        public ModelRouterQueryNacosProvidersResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModelRouterQueryNacosProvidersResponseBodyData setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

    }

}
