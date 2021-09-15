// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDomainOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainOverviewResponseBody body;

    public static GetDomainOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainOverviewResponse self = new GetDomainOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainOverviewResponse setBody(GetDomainOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainOverviewResponseBody getBody() {
        return this.body;
    }

}
