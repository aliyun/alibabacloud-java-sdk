// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSeoBypassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSeoBypassResponseBody body;

    public static GetSeoBypassResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSeoBypassResponse self = new GetSeoBypassResponse();
        return TeaModel.build(map, self);
    }

    public GetSeoBypassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSeoBypassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSeoBypassResponse setBody(GetSeoBypassResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSeoBypassResponseBody getBody() {
        return this.body;
    }

}
