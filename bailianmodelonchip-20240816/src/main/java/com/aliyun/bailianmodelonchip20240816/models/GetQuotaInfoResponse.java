// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetQuotaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQuotaInfoResponseBody body;

    public static GetQuotaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaInfoResponse self = new GetQuotaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaInfoResponse setBody(GetQuotaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaInfoResponseBody getBody() {
        return this.body;
    }

}
