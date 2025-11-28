// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDashboardBaseInfoResponseBody body;

    public static DescribeDashboardBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardBaseInfoResponse self = new DescribeDashboardBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDashboardBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDashboardBaseInfoResponse setBody(DescribeDashboardBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDashboardBaseInfoResponseBody getBody() {
        return this.body;
    }

}
