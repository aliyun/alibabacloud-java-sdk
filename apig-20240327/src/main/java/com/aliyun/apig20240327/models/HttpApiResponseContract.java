// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiResponseContract extends TeaModel {
    /**
     * <p>The content type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application/json</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The response definition.</p>
     */
    @NameInMap("items")
    public java.util.List<HttpApiResponseContractItems> items;

    public static HttpApiResponseContract build(java.util.Map<String, ?> map) throws Exception {
        HttpApiResponseContract self = new HttpApiResponseContract();
        return TeaModel.build(map, self);
    }

    public HttpApiResponseContract setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public HttpApiResponseContract setItems(java.util.List<HttpApiResponseContractItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<HttpApiResponseContractItems> getItems() {
        return this.items;
    }

    public static class HttpApiResponseContractItems extends TeaModel {
        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public Integer code;

        /**
         * <p>The response description.</p>
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
         * <p>{&quot;result&quot;: &quot;ok&quot;}</p>
         */
        @NameInMap("example")
        public String example;

        /**
         * <p>The JSON definition description of the response body.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;type&quot;: &quot;object&quot;,
         *     &quot;required&quot;: [
         *         &quot;result&quot;
         *     ],
         *     &quot;properties&quot;: {
         *         &quot;result&quot;: {
         *             &quot;type&quot;: &quot;string&quot;,
         *             &quot;description&quot;: &quot;This is a description.&quot;
         *         }
         *     }
         * }</p>
         */
        @NameInMap("jsonSchema")
        public String jsonSchema;

        public static HttpApiResponseContractItems build(java.util.Map<String, ?> map) throws Exception {
            HttpApiResponseContractItems self = new HttpApiResponseContractItems();
            return TeaModel.build(map, self);
        }

        public HttpApiResponseContractItems setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public HttpApiResponseContractItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public HttpApiResponseContractItems setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public HttpApiResponseContractItems setJsonSchema(String jsonSchema) {
            this.jsonSchema = jsonSchema;
            return this;
        }
        public String getJsonSchema() {
            return this.jsonSchema;
        }

    }

}
