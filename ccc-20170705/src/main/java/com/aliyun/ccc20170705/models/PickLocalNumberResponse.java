// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickLocalNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PickLocalNumberResponseBody body;

    public static PickLocalNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        PickLocalNumberResponse self = new PickLocalNumberResponse();
        return TeaModel.build(map, self);
    }

    public PickLocalNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PickLocalNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PickLocalNumberResponse setBody(PickLocalNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public PickLocalNumberResponseBody getBody() {
        return this.body;
    }

}
