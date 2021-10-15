// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DeleteStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStoreResponseBody body;

    public static DeleteStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoreResponse self = new DeleteStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStoreResponse setBody(DeleteStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStoreResponseBody getBody() {
        return this.body;
    }

}
