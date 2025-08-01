// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageAmountSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageAmountSummaryResponseBody body;

    public static GetStorageAmountSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageAmountSummaryResponse self = new GetStorageAmountSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageAmountSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageAmountSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageAmountSummaryResponse setBody(GetStorageAmountSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageAmountSummaryResponseBody getBody() {
        return this.body;
    }

}
