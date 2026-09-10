// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckReRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckReRunResponseBody body;

    public static ExecDataCheckReRunResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckReRunResponse self = new ExecDataCheckReRunResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckReRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckReRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckReRunResponse setBody(ExecDataCheckReRunResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckReRunResponseBody getBody() {
        return this.body;
    }

}
