// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertResourceResponseBody body;

    public static DescribeAlertResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertResourceResponse self = new DescribeAlertResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertResourceResponse setBody(DescribeAlertResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertResourceResponseBody getBody() {
        return this.body;
    }

}
