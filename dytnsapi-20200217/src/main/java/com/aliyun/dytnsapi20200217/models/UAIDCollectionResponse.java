// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UAIDCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UAIDCollectionResponseBody body;

    public static UAIDCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UAIDCollectionResponse self = new UAIDCollectionResponse();
        return TeaModel.build(map, self);
    }

    public UAIDCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UAIDCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UAIDCollectionResponse setBody(UAIDCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UAIDCollectionResponseBody getBody() {
        return this.body;
    }

}
