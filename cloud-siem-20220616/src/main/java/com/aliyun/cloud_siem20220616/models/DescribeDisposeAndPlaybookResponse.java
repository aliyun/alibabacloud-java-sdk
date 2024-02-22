// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDisposeAndPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDisposeAndPlaybookResponseBody body;

    public static DescribeDisposeAndPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisposeAndPlaybookResponse self = new DescribeDisposeAndPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDisposeAndPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDisposeAndPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDisposeAndPlaybookResponse setBody(DescribeDisposeAndPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDisposeAndPlaybookResponseBody getBody() {
        return this.body;
    }

}
