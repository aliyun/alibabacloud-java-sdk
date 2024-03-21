// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class RebootDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootDesktopsResponseBody body;

    public static RebootDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootDesktopsResponse self = new RebootDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public RebootDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootDesktopsResponse setBody(RebootDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootDesktopsResponseBody getBody() {
        return this.body;
    }

}
