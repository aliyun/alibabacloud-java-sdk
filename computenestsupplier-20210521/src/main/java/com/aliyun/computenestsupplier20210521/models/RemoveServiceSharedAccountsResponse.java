// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RemoveServiceSharedAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveServiceSharedAccountsResponseBody body;

    public static RemoveServiceSharedAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveServiceSharedAccountsResponse self = new RemoveServiceSharedAccountsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveServiceSharedAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveServiceSharedAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveServiceSharedAccountsResponse setBody(RemoveServiceSharedAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveServiceSharedAccountsResponseBody getBody() {
        return this.body;
    }

}
