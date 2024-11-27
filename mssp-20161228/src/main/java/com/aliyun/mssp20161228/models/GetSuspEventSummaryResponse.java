// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspEventSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSuspEventSummaryResponseBody body;

    public static GetSuspEventSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSuspEventSummaryResponse self = new GetSuspEventSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetSuspEventSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSuspEventSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSuspEventSummaryResponse setBody(GetSuspEventSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSuspEventSummaryResponseBody getBody() {
        return this.body;
    }

}
