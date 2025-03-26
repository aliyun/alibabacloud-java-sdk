// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCenterPolicyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCenterPolicyListResponseBody body;

    public static DescribeCenterPolicyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenterPolicyListResponse self = new DescribeCenterPolicyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenterPolicyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenterPolicyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenterPolicyListResponse setBody(DescribeCenterPolicyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenterPolicyListResponseBody getBody() {
        return this.body;
    }

}
