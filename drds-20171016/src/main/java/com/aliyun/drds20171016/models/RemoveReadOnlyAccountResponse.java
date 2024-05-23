// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class RemoveReadOnlyAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveReadOnlyAccountResponseBody body;

    public static RemoveReadOnlyAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveReadOnlyAccountResponse self = new RemoveReadOnlyAccountResponse();
        return TeaModel.build(map, self);
    }

    public RemoveReadOnlyAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveReadOnlyAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveReadOnlyAccountResponse setBody(RemoveReadOnlyAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveReadOnlyAccountResponseBody getBody() {
        return this.body;
    }

}
