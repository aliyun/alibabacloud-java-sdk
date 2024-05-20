// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeManualTaskInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeManualTaskInstanceResponseBody body;

    public static DescribeManualTaskInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeManualTaskInstanceResponse self = new DescribeManualTaskInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeManualTaskInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeManualTaskInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeManualTaskInstanceResponse setBody(DescribeManualTaskInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeManualTaskInstanceResponseBody getBody() {
        return this.body;
    }

}
