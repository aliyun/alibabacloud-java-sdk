// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountSummaryResponseBody body;

    public static GetAccountSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSummaryResponse self = new GetAccountSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountSummaryResponse setBody(GetAccountSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountSummaryResponseBody getBody() {
        return this.body;
    }

}
