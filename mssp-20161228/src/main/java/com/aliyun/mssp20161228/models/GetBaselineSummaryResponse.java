// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetBaselineSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBaselineSummaryResponseBody body;

    public static GetBaselineSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineSummaryResponse self = new GetBaselineSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetBaselineSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBaselineSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBaselineSummaryResponse setBody(GetBaselineSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBaselineSummaryResponseBody getBody() {
        return this.body;
    }

}
