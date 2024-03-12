// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationResponseBody body;

    public static EnableApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationResponse self = new EnableApplicationResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationResponse setBody(EnableApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationResponseBody getBody() {
        return this.body;
    }

}
