// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAclEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclEntriesResponseBody body;

    public static DescribeAclEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclEntriesResponse self = new DescribeAclEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclEntriesResponse setBody(DescribeAclEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclEntriesResponseBody getBody() {
        return this.body;
    }

}
