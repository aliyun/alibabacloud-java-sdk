// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelOperatorUsageResponseBody body;

    public static DescribeModelOperatorUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorUsageResponse self = new DescribeModelOperatorUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelOperatorUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelOperatorUsageResponse setBody(DescribeModelOperatorUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelOperatorUsageResponseBody getBody() {
        return this.body;
    }

}
