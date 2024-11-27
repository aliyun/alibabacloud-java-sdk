// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulPageSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVulPageSummaryResponseBody body;

    public static GetVulPageSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulPageSummaryResponse self = new GetVulPageSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetVulPageSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulPageSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVulPageSummaryResponse setBody(GetVulPageSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulPageSummaryResponseBody getBody() {
        return this.body;
    }

}
