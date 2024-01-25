// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCidInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCidInfoResponseBody body;

    public static GetCidInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCidInfoResponse self = new GetCidInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCidInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCidInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCidInfoResponse setBody(GetCidInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCidInfoResponseBody getBody() {
        return this.body;
    }

}
