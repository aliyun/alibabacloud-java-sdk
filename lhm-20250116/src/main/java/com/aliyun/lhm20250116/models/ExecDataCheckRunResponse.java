// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckRunResponseBody body;

    public static ExecDataCheckRunResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckRunResponse self = new ExecDataCheckRunResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckRunResponse setBody(ExecDataCheckRunResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckRunResponseBody getBody() {
        return this.body;
    }

}
