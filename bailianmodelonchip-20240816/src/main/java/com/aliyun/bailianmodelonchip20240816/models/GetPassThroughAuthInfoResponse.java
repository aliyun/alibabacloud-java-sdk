// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetPassThroughAuthInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPassThroughAuthInfoResponseBody body;

    public static GetPassThroughAuthInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPassThroughAuthInfoResponse self = new GetPassThroughAuthInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPassThroughAuthInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPassThroughAuthInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPassThroughAuthInfoResponse setBody(GetPassThroughAuthInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPassThroughAuthInfoResponseBody getBody() {
        return this.body;
    }

}
