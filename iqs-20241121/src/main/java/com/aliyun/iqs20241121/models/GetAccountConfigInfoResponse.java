// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class GetAccountConfigInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountConfigInfoResponseBody body;

    public static GetAccountConfigInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountConfigInfoResponse self = new GetAccountConfigInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountConfigInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountConfigInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountConfigInfoResponse setBody(GetAccountConfigInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountConfigInfoResponseBody getBody() {
        return this.body;
    }

}
