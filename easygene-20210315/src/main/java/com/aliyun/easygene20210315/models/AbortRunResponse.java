// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class AbortRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbortRunResponseBody body;

    public static AbortRunResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortRunResponse self = new AbortRunResponse();
        return TeaModel.build(map, self);
    }

    public AbortRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortRunResponse setBody(AbortRunResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortRunResponseBody getBody() {
        return this.body;
    }

}
