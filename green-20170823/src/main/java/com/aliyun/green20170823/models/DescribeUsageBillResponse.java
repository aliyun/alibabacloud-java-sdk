// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUsageBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUsageBillResponseBody body;

    public static DescribeUsageBillResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageBillResponse self = new DescribeUsageBillResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsageBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsageBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsageBillResponse setBody(DescribeUsageBillResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsageBillResponseBody getBody() {
        return this.body;
    }

}
