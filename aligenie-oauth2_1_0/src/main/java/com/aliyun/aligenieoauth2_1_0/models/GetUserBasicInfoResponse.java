// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class GetUserBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserBasicInfoResponseBody body;

    public static GetUserBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserBasicInfoResponse self = new GetUserBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserBasicInfoResponse setBody(GetUserBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserBasicInfoResponseBody getBody() {
        return this.body;
    }

}
