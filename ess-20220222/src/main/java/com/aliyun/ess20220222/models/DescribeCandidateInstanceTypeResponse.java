// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeCandidateInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCandidateInstanceTypeResponseBody body;

    public static DescribeCandidateInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCandidateInstanceTypeResponse self = new DescribeCandidateInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCandidateInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCandidateInstanceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCandidateInstanceTypeResponse setBody(DescribeCandidateInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCandidateInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
