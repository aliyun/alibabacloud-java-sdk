// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContextStoreAPIKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextStoreAPIKeyResponseBody body;

    public static DeleteContextStoreAPIKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextStoreAPIKeyResponse self = new DeleteContextStoreAPIKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextStoreAPIKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextStoreAPIKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextStoreAPIKeyResponse setBody(DeleteContextStoreAPIKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextStoreAPIKeyResponseBody getBody() {
        return this.body;
    }

}
