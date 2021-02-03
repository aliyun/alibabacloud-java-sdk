// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTransferDomainsResponseBody body;

    public static DescribeTransferDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferDomainsResponse self = new DescribeTransferDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransferDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransferDomainsResponse setBody(DescribeTransferDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransferDomainsResponseBody getBody() {
        return this.body;
    }

}
