// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSafetyCoverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSafetyCoverResponseBody body;

    public static GetSafetyCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSafetyCoverResponse self = new GetSafetyCoverResponse();
        return TeaModel.build(map, self);
    }

    public GetSafetyCoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSafetyCoverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSafetyCoverResponse setBody(GetSafetyCoverResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSafetyCoverResponseBody getBody() {
        return this.body;
    }

}
