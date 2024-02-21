// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDtsJobsResponseBody body;

    public static DescribeDtsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobsResponse self = new DescribeDtsJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDtsJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDtsJobsResponse setBody(DescribeDtsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDtsJobsResponseBody getBody() {
        return this.body;
    }

}
