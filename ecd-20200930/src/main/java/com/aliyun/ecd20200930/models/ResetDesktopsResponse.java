// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDesktopsResponseBody body;

    public static ResetDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDesktopsResponse self = new ResetDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public ResetDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDesktopsResponse setBody(ResetDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDesktopsResponseBody getBody() {
        return this.body;
    }

}
