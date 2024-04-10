// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepoTagScanSummaryResponseBody body;

    public static GetRepoTagScanSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagScanSummaryResponse self = new GetRepoTagScanSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoTagScanSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoTagScanSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepoTagScanSummaryResponse setBody(GetRepoTagScanSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoTagScanSummaryResponseBody getBody() {
        return this.body;
    }

}
