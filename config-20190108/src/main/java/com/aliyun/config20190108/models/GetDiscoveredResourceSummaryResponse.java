// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDiscoveredResourceSummaryResponseBody body;

    public static GetDiscoveredResourceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceSummaryResponse self = new GetDiscoveredResourceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiscoveredResourceSummaryResponse setBody(GetDiscoveredResourceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiscoveredResourceSummaryResponseBody getBody() {
        return this.body;
    }

}
