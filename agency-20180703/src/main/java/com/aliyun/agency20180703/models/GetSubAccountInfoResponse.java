// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetSubAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubAccountInfoResponseBody body;

    public static GetSubAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubAccountInfoResponse self = new GetSubAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSubAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubAccountInfoResponse setBody(GetSubAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubAccountInfoResponseBody getBody() {
        return this.body;
    }

}
