// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetWorkTaskSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkTaskSummaryResponseBody body;

    public static GetWorkTaskSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkTaskSummaryResponse self = new GetWorkTaskSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkTaskSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkTaskSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkTaskSummaryResponse setBody(GetWorkTaskSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkTaskSummaryResponseBody getBody() {
        return this.body;
    }

}
