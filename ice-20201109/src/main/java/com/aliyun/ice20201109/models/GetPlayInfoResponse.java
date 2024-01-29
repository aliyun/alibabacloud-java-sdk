// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPlayInfoResponseBody body;

    public static GetPlayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoResponse self = new GetPlayInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPlayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlayInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPlayInfoResponse setBody(GetPlayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlayInfoResponseBody getBody() {
        return this.body;
    }

}
