// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserVipsByDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserVipsByDomainResponseBody body;

    public static DescribeUserVipsByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVipsByDomainResponse self = new DescribeUserVipsByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserVipsByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserVipsByDomainResponse setBody(DescribeUserVipsByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserVipsByDomainResponseBody getBody() {
        return this.body;
    }

}
