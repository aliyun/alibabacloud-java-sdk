// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageSizeSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageSizeSummaryResponseBody body;

    public static GetStorageSizeSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSizeSummaryResponse self = new GetStorageSizeSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageSizeSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageSizeSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageSizeSummaryResponse setBody(GetStorageSizeSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageSizeSummaryResponseBody getBody() {
        return this.body;
    }

}
