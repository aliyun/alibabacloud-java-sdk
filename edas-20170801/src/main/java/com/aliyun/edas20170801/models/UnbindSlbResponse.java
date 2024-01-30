// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UnbindSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindSlbResponseBody body;

    public static UnbindSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlbResponse self = new UnbindSlbResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindSlbResponse setBody(UnbindSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSlbResponseBody getBody() {
        return this.body;
    }

}
