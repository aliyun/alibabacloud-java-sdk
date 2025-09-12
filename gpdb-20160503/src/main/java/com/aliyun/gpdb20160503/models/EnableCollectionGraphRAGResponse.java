// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class EnableCollectionGraphRAGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCollectionGraphRAGResponseBody body;

    public static EnableCollectionGraphRAGResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCollectionGraphRAGResponse self = new EnableCollectionGraphRAGResponse();
        return TeaModel.build(map, self);
    }

    public EnableCollectionGraphRAGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCollectionGraphRAGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCollectionGraphRAGResponse setBody(EnableCollectionGraphRAGResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCollectionGraphRAGResponseBody getBody() {
        return this.body;
    }

}
