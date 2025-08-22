// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class RemoveSharedAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSharedAccountsResponseBody body;

    public static RemoveSharedAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSharedAccountsResponse self = new RemoveSharedAccountsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSharedAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSharedAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSharedAccountsResponse setBody(RemoveSharedAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSharedAccountsResponseBody getBody() {
        return this.body;
    }

}
