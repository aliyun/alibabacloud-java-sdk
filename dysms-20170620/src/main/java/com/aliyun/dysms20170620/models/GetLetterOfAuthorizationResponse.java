// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class GetLetterOfAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLetterOfAuthorizationResponseBody body;

    public static GetLetterOfAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLetterOfAuthorizationResponse self = new GetLetterOfAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public GetLetterOfAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLetterOfAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLetterOfAuthorizationResponse setBody(GetLetterOfAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLetterOfAuthorizationResponseBody getBody() {
        return this.body;
    }

}
