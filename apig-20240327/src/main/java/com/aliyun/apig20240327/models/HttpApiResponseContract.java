// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiResponseContract extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application/json</p>
     */
    @NameInMap("contentType")
    public String contentType;

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
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>正常接口响应</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{&quot;result&quot;: &quot;ok&quot;}</p>
         */
        @NameInMap("example")
        public String example;

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
