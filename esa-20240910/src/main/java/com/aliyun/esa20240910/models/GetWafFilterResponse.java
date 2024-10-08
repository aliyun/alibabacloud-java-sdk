// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWafFilterResponseBody body;

    public static GetWafFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWafFilterResponse self = new GetWafFilterResponse();
        return TeaModel.build(map, self);
    }

    public GetWafFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWafFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWafFilterResponse setBody(GetWafFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWafFilterResponseBody getBody() {
        return this.body;
    }

}
