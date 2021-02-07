// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAccountSummaryResponse setBody(GetAccountSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountSummaryResponseBody getBody() {
        return this.body;
    }

}
