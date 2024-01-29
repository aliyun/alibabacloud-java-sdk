// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ExitStandbyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExitStandbyResponseBody body;

    public static ExitStandbyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExitStandbyResponse self = new ExitStandbyResponse();
        return TeaModel.build(map, self);
    }

    public ExitStandbyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExitStandbyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExitStandbyResponse setBody(ExitStandbyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExitStandbyResponseBody getBody() {
        return this.body;
    }

}
