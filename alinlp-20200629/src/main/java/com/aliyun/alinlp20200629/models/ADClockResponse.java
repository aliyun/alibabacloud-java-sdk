// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ADClockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ADClockResponseBody body;

    public static ADClockResponse build(java.util.Map<String, ?> map) throws Exception {
        ADClockResponse self = new ADClockResponse();
        return TeaModel.build(map, self);
    }

    public ADClockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ADClockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ADClockResponse setBody(ADClockResponseBody body) {
        this.body = body;
        return this;
    }
    public ADClockResponseBody getBody() {
        return this.body;
    }

}
