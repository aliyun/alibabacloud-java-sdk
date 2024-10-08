// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWafQuotaResponseBody body;

    public static GetWafQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWafQuotaResponse self = new GetWafQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetWafQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWafQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWafQuotaResponse setBody(GetWafQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWafQuotaResponseBody getBody() {
        return this.body;
    }

}
