// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindEcsSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindEcsSlbResponseBody body;

    public static BindEcsSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEcsSlbResponse self = new BindEcsSlbResponse();
        return TeaModel.build(map, self);
    }

    public BindEcsSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEcsSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindEcsSlbResponse setBody(BindEcsSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEcsSlbResponseBody getBody() {
        return this.body;
    }

}
