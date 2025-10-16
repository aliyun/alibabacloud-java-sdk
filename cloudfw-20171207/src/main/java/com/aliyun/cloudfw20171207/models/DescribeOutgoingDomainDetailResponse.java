// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingDomainDetailResponseBody body;

    public static DescribeOutgoingDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDomainDetailResponse self = new DescribeOutgoingDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingDomainDetailResponse setBody(DescribeOutgoingDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingDomainDetailResponseBody getBody() {
        return this.body;
    }

}
