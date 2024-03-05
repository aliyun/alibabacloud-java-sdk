// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InstallSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallSoftwareResponseBody body;

    public static InstallSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallSoftwareResponse self = new InstallSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public InstallSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallSoftwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallSoftwareResponse setBody(InstallSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallSoftwareResponseBody getBody() {
        return this.body;
    }

}
