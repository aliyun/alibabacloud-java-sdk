// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRepoTagScanSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

}
