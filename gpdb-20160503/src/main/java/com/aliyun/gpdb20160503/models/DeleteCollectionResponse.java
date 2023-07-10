// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCollectionResponseBody body;

    public static DeleteCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectionResponse self = new DeleteCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCollectionResponse setBody(DeleteCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCollectionResponseBody getBody() {
        return this.body;
    }

}
