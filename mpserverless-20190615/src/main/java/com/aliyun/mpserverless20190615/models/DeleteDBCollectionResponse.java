// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteDBCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBCollectionResponseBody body;

    public static DeleteDBCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBCollectionResponse self = new DeleteDBCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBCollectionResponse setBody(DeleteDBCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBCollectionResponseBody getBody() {
        return this.body;
    }

}
