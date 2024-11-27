// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspPageSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSuspPageSummaryResponseBody body;

    public static GetSuspPageSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSuspPageSummaryResponse self = new GetSuspPageSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetSuspPageSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSuspPageSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSuspPageSummaryResponse setBody(GetSuspPageSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSuspPageSummaryResponseBody getBody() {
        return this.body;
    }

}
