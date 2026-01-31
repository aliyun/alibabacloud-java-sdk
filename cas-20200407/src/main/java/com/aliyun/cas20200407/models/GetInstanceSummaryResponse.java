// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceSummaryResponseBody body;

    public static GetInstanceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryResponse self = new GetInstanceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceSummaryResponse setBody(GetInstanceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSummaryResponseBody getBody() {
        return this.body;
    }

}
