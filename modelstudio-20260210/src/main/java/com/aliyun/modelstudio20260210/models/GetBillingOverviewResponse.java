// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBillingOverviewResponseBody body;

    public static GetBillingOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBillingOverviewResponse self = new GetBillingOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetBillingOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBillingOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBillingOverviewResponse setBody(GetBillingOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBillingOverviewResponseBody getBody() {
        return this.body;
    }

}
