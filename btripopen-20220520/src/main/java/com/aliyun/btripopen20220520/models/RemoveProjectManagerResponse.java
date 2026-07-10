// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class RemoveProjectManagerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveProjectManagerResponseBody body;

    public static RemoveProjectManagerResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectManagerResponse self = new RemoveProjectManagerResponse();
        return TeaModel.build(map, self);
    }

    public RemoveProjectManagerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveProjectManagerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveProjectManagerResponse setBody(RemoveProjectManagerResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveProjectManagerResponseBody getBody() {
        return this.body;
    }

}
