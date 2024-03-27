// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeTaskInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskInstanceResponseBody body;

    public static DescribeTaskInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInstanceResponse self = new DescribeTaskInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskInstanceResponse setBody(DescribeTaskInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskInstanceResponseBody getBody() {
        return this.body;
    }

}
