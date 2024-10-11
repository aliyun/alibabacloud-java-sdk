// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKvAccountResponseBody body;

    public static GetKvAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKvAccountResponse self = new GetKvAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetKvAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKvAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKvAccountResponse setBody(GetKvAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKvAccountResponseBody getBody() {
        return this.body;
    }

}
