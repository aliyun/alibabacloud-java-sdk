// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetResolveCountSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResolveCountSummaryResponseBody body;

    public static GetResolveCountSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResolveCountSummaryResponse self = new GetResolveCountSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetResolveCountSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResolveCountSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResolveCountSummaryResponse setBody(GetResolveCountSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResolveCountSummaryResponseBody getBody() {
        return this.body;
    }

}
