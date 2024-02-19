// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GrantCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantCollectionResponseBody body;

    public static GrantCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantCollectionResponse self = new GrantCollectionResponse();
        return TeaModel.build(map, self);
    }

    public GrantCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantCollectionResponse setBody(GrantCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantCollectionResponseBody getBody() {
        return this.body;
    }

}
