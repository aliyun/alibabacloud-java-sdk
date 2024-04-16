// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDomainOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetDomainOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDomainOverviewResponse setBody(GetDomainOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainOverviewResponseBody getBody() {
        return this.body;
    }

}
