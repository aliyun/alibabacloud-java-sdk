// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckStopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckStopResponseBody body;

    public static ExecDataCheckStopResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckStopResponse self = new ExecDataCheckStopResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckStopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckStopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckStopResponse setBody(ExecDataCheckStopResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckStopResponseBody getBody() {
        return this.body;
    }

}
