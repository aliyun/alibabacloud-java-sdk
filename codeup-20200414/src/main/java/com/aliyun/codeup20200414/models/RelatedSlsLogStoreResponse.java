// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class RelatedSlsLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RelatedSlsLogStoreResponseBody body;

    public static RelatedSlsLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        RelatedSlsLogStoreResponse self = new RelatedSlsLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public RelatedSlsLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RelatedSlsLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RelatedSlsLogStoreResponse setBody(RelatedSlsLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public RelatedSlsLogStoreResponseBody getBody() {
        return this.body;
    }

}
