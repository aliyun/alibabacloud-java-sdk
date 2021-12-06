// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetResolveCountSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResolveCountSummaryResponseBody body;

    public static GetResolveCountSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResolveCountSummaryResponse self = new GetResolveCountSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetResolveCountSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResolveCountSummaryResponse setBody(GetResolveCountSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResolveCountSummaryResponseBody getBody() {
        return this.body;
    }

}
