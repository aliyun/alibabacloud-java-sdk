// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAxbResponseBody body;

    public static BindAxbResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxbResponse self = new BindAxbResponse();
        return TeaModel.build(map, self);
    }

    public BindAxbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAxbResponse setBody(BindAxbResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxbResponseBody getBody() {
        return this.body;
    }

}
