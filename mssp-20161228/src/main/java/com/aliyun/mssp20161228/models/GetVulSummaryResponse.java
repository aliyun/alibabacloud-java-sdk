// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVulSummaryResponseBody body;

    public static GetVulSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulSummaryResponse self = new GetVulSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetVulSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVulSummaryResponse setBody(GetVulSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulSummaryResponseBody getBody() {
        return this.body;
    }

}
