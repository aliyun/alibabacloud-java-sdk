// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiRequestContract extends TeaModel {
    /**
     * <p>The body parameters.</p>
     */
    @NameInMap("body")
    public HttpApiRequestContractBody body;

    /**
     * <p>The request header parameters.</p>
     */
    @NameInMap("headerParameters")
    public java.util.List<HttpApiParameter> headerParameters;

    /**
     * <p>The path parameters.</p>
     */
    @NameInMap("pathParameters")
    public java.util.List<HttpApiParameter> pathParameters;

    /**
     * <p>The query parameters.</p>
     */
    @NameInMap("queryParameters")
    public java.util.List<HttpApiParameter> queryParameters;

    public static HttpApiRequestContract build(java.util.Map<String, ?> map) throws Exception {
        HttpApiRequestContract self = new HttpApiRequestContract();
        return TeaModel.build(map, self);
    }

    public HttpApiRequestContract setBody(HttpApiRequestContractBody body) {
        this.body = body;
        return this;
    }
    public HttpApiRequestContractBody getBody() {
        return this.body;
    }

    public HttpApiRequestContract setHeaderParameters(java.util.List<HttpApiParameter> headerParameters) {
        this.headerParameters = headerParameters;
        return this;
    }
    public java.util.List<HttpApiParameter> getHeaderParameters() {
        return this.headerParameters;
    }

    public HttpApiRequestContract setPathParameters(java.util.List<HttpApiParameter> pathParameters) {
        this.pathParameters = pathParameters;
        return this;
    }
    public java.util.List<HttpApiParameter> getPathParameters() {
        return this.pathParameters;
    }

    public HttpApiRequestContract setQueryParameters(java.util.List<HttpApiParameter> queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }
    public java.util.List<HttpApiParameter> getQueryParameters() {
        return this.queryParameters;
    }

    public static class HttpApiRequestContractBody extends TeaModel {
        /**
         * <p>The content type of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;result&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("example")
        public String example;

        /**
         * <p>The JSON definition description of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;type&quot;: &quot;object&quot;,
         *       &quot;required&quot;: [
         *           &quot;result&quot;
         *       ],
         *       &quot;properties&quot;: {
         *           &quot;result&quot;: {
         *               &quot;type&quot;: &quot;string&quot;,
         *               &quot;description&quot;: &quot;Operation result. \&quot;ok\&quot; indicates success.&quot;
         *           }
         *       }
         *   }</p>
         */
        @NameInMap("jsonSchema")
        public String jsonSchema;

        public static HttpApiRequestContractBody build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRequestContractBody self = new HttpApiRequestContractBody();
            return TeaModel.build(map, self);
        }

        public HttpApiRequestContractBody setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public HttpApiRequestContractBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public HttpApiRequestContractBody setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public HttpApiRequestContractBody setJsonSchema(String jsonSchema) {
            this.jsonSchema = jsonSchema;
            return this;
        }
        public String getJsonSchema() {
            return this.jsonSchema;
        }

    }

}
