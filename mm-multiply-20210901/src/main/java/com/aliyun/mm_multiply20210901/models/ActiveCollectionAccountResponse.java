// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ActiveCollectionAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ActiveCollectionAccountResponseBody body;

    public static ActiveCollectionAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveCollectionAccountResponse self = new ActiveCollectionAccountResponse();
        return TeaModel.build(map, self);
    }

    public ActiveCollectionAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveCollectionAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActiveCollectionAccountResponse setBody(ActiveCollectionAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveCollectionAccountResponseBody getBody() {
        return this.body;
    }

}
