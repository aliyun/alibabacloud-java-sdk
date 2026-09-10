// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckRunFailedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckRunFailedResponseBody body;

    public static ExecDataCheckRunFailedResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckRunFailedResponse self = new ExecDataCheckRunFailedResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckRunFailedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckRunFailedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckRunFailedResponse setBody(ExecDataCheckRunFailedResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckRunFailedResponseBody getBody() {
        return this.body;
    }

}
