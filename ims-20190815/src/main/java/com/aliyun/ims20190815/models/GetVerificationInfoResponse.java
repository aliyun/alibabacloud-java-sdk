// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetVerificationInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVerificationInfoResponseBody body;

    public static GetVerificationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVerificationInfoResponse self = new GetVerificationInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetVerificationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVerificationInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVerificationInfoResponse setBody(GetVerificationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVerificationInfoResponseBody getBody() {
        return this.body;
    }

}
