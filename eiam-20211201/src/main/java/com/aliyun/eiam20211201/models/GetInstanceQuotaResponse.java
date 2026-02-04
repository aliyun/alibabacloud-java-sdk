// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceQuotaResponseBody body;

    public static GetInstanceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceQuotaResponse self = new GetInstanceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceQuotaResponse setBody(GetInstanceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceQuotaResponseBody getBody() {
        return this.body;
    }

}
