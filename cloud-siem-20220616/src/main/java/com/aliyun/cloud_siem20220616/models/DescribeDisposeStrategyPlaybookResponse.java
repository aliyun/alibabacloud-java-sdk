// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDisposeStrategyPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDisposeStrategyPlaybookResponseBody body;

    public static DescribeDisposeStrategyPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisposeStrategyPlaybookResponse self = new DescribeDisposeStrategyPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDisposeStrategyPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDisposeStrategyPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDisposeStrategyPlaybookResponse setBody(DescribeDisposeStrategyPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDisposeStrategyPlaybookResponseBody getBody() {
        return this.body;
    }

}
