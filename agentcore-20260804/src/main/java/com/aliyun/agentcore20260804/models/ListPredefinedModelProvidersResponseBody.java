// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListPredefinedModelProvidersResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of predefined model providers.</p>
     */
    @NameInMap("data")
    public java.util.List<ListPredefinedModelProvidersResponseBodyData> data;

    /**
     * <p>The HTTP status code. The value is 200 if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message about the request processing result.</p>
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
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListPredefinedModelProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedModelProvidersResponseBody self = new ListPredefinedModelProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPredefinedModelProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPredefinedModelProvidersResponseBody setData(java.util.List<ListPredefinedModelProvidersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPredefinedModelProvidersResponseBodyData> getData() {
        return this.data;
    }

    public ListPredefinedModelProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPredefinedModelProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPredefinedModelProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPredefinedModelProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPredefinedModelProvidersResponseBodyData extends TeaModel {
        /**
         * <p>The default model service endpoint of the provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("defaultEndpoint")
        public String defaultEndpoint;

        /**
         * <p>The default model invocation protocol of the provider.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI/v1</p>
         */
        @NameInMap("defaultProtocol")
        public String defaultProtocol;

        /**
         * <p>The display name of the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Model Studio</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The model provider type.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("providerType")
        public String providerType;

        public static ListPredefinedModelProvidersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPredefinedModelProvidersResponseBodyData self = new ListPredefinedModelProvidersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPredefinedModelProvidersResponseBodyData setDefaultEndpoint(String defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }
        public String getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        public ListPredefinedModelProvidersResponseBodyData setDefaultProtocol(String defaultProtocol) {
            this.defaultProtocol = defaultProtocol;
            return this;
        }
        public String getDefaultProtocol() {
            return this.defaultProtocol;
        }

        public ListPredefinedModelProvidersResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListPredefinedModelProvidersResponseBodyData setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

    }

}
