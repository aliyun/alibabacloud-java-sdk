// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetGuardStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGuardStatusResponseBody body;

    public static GetGuardStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGuardStatusResponse self = new GetGuardStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetGuardStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGuardStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGuardStatusResponse setBody(GetGuardStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGuardStatusResponseBody getBody() {
        return this.body;
    }

}
