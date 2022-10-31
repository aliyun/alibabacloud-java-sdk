// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessageUserInfoResponseBody body;

    public static GetMessageUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageUserInfoResponse self = new GetMessageUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageUserInfoResponse setBody(GetMessageUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageUserInfoResponseBody getBody() {
        return this.body;
    }

}
