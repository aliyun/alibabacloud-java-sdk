// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDtsJobsResponse setBody(DescribeDtsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDtsJobsResponseBody getBody() {
        return this.body;
    }

}
