// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSimpleDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSimpleDomainsResponseBody body;

    public static DescribeSimpleDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimpleDomainsResponse self = new DescribeSimpleDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSimpleDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSimpleDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSimpleDomainsResponse setBody(DescribeSimpleDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSimpleDomainsResponseBody getBody() {
        return this.body;
    }

}
