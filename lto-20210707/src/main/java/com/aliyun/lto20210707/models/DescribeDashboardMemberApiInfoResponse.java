// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardMemberApiInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDashboardMemberApiInfoResponseBody body;

    public static DescribeDashboardMemberApiInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardMemberApiInfoResponse self = new DescribeDashboardMemberApiInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardMemberApiInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDashboardMemberApiInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDashboardMemberApiInfoResponse setBody(DescribeDashboardMemberApiInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDashboardMemberApiInfoResponseBody getBody() {
        return this.body;
    }

}
