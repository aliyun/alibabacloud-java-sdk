// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class GetCustomizedInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomizedInfoResponseBody body;

    public static GetCustomizedInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedInfoResponse self = new GetCustomizedInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomizedInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomizedInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomizedInfoResponse setBody(GetCustomizedInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomizedInfoResponseBody getBody() {
        return this.body;
    }

}
