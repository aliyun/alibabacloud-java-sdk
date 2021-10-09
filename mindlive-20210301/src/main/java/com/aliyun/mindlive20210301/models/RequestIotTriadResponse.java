// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestIotTriadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestIotTriadResponseBody body;

    public static RequestIotTriadResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestIotTriadResponse self = new RequestIotTriadResponse();
        return TeaModel.build(map, self);
    }

    public RequestIotTriadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestIotTriadResponse setBody(RequestIotTriadResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestIotTriadResponseBody getBody() {
        return this.body;
    }

}
