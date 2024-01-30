// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetChangeOrderInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChangeOrderInfoResponseBody body;

    public static GetChangeOrderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderInfoResponse self = new GetChangeOrderInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChangeOrderInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChangeOrderInfoResponse setBody(GetChangeOrderInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChangeOrderInfoResponseBody getBody() {
        return this.body;
    }

}
