// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDiagInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiagInfoResponseBody body;

    public static GetDiagInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagInfoResponse self = new GetDiagInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDiagInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiagInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiagInfoResponse setBody(GetDiagInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiagInfoResponseBody getBody() {
        return this.body;
    }

}
