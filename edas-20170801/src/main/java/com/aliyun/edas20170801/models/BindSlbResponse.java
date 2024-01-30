// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindSlbResponseBody body;

    public static BindSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        BindSlbResponse self = new BindSlbResponse();
        return TeaModel.build(map, self);
    }

    public BindSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindSlbResponse setBody(BindSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public BindSlbResponseBody getBody() {
        return this.body;
    }

}
