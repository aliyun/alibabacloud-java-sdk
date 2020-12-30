// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetRepoTagScanSummaryResponse setBody(GetRepoTagScanSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoTagScanSummaryResponseBody getBody() {
        return this.body;
    }

}
