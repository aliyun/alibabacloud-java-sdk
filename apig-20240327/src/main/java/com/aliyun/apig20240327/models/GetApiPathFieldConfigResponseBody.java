// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetApiPathFieldConfigResponseBody extends TeaModel {
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
    public GetApiPathFieldConfigResponseBodyData data;

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

    public static GetApiPathFieldConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiPathFieldConfigResponseBody self = new GetApiPathFieldConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiPathFieldConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApiPathFieldConfigResponseBody setData(GetApiPathFieldConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApiPathFieldConfigResponseBodyData getData() {
        return this.data;
    }

    public GetApiPathFieldConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApiPathFieldConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApiPathFieldConfigResponseBodyDataPathConfigs extends TeaModel {
        /**
         * <p>The collection of field configurations under the path, grouped by mapping key, where each group represents a set of field configuration items.</p>
         */
        @NameInMap("fieldPaths")
        public java.util.Map<String, java.util.List<DataPathConfigsFieldPathsValue>> fieldPaths;

        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        public static GetApiPathFieldConfigResponseBodyDataPathConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetApiPathFieldConfigResponseBodyDataPathConfigs self = new GetApiPathFieldConfigResponseBodyDataPathConfigs();
            return TeaModel.build(map, self);
        }

        public GetApiPathFieldConfigResponseBodyDataPathConfigs setFieldPaths(java.util.Map<String, java.util.List<DataPathConfigsFieldPathsValue>> fieldPaths) {
            this.fieldPaths = fieldPaths;
            return this;
        }
        public java.util.Map<String, java.util.List<DataPathConfigsFieldPathsValue>> getFieldPaths() {
            return this.fieldPaths;
        }

        public GetApiPathFieldConfigResponseBodyDataPathConfigs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetApiPathFieldConfigResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-123456</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <p>The ID of the cloud-native API gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The list of field configurations grouped by API request path.</p>
         */
        @NameInMap("pathConfigs")
        public java.util.List<GetApiPathFieldConfigResponseBodyDataPathConfigs> pathConfigs;

        public static GetApiPathFieldConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApiPathFieldConfigResponseBodyData self = new GetApiPathFieldConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApiPathFieldConfigResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetApiPathFieldConfigResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetApiPathFieldConfigResponseBodyData setPathConfigs(java.util.List<GetApiPathFieldConfigResponseBodyDataPathConfigs> pathConfigs) {
            this.pathConfigs = pathConfigs;
            return this;
        }
        public java.util.List<GetApiPathFieldConfigResponseBodyDataPathConfigs> getPathConfigs() {
            return this.pathConfigs;
        }

    }

}
