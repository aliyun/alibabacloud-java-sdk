// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class InstallSoftwaresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallSoftwaresResponseBody body;

    public static InstallSoftwaresResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallSoftwaresResponse self = new InstallSoftwaresResponse();
        return TeaModel.build(map, self);
    }

    public InstallSoftwaresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallSoftwaresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallSoftwaresResponse setBody(InstallSoftwaresResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallSoftwaresResponseBody getBody() {
        return this.body;
    }

}
