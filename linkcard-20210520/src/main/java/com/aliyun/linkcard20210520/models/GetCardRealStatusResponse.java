// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardRealStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardRealStatusResponseBody body;

    public static GetCardRealStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardRealStatusResponse self = new GetCardRealStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetCardRealStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardRealStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardRealStatusResponse setBody(GetCardRealStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardRealStatusResponseBody getBody() {
        return this.body;
    }

}
