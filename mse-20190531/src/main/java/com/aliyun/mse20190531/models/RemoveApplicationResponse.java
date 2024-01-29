// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RemoveApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveApplicationResponseBody body;

    public static RemoveApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationResponse self = new RemoveApplicationResponse();
        return TeaModel.build(map, self);
    }

    public RemoveApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveApplicationResponse setBody(RemoveApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveApplicationResponseBody getBody() {
        return this.body;
    }

}
