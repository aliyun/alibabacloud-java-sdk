// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardApiInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDashboardApiInfoResponseBody body;

    public static DescribeDashboardApiInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardApiInfoResponse self = new DescribeDashboardApiInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardApiInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDashboardApiInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDashboardApiInfoResponse setBody(DescribeDashboardApiInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDashboardApiInfoResponseBody getBody() {
        return this.body;
    }

}
