// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertTypeResponseBody body;

    public static DescribeAlertTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertTypeResponse self = new DescribeAlertTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertTypeResponse setBody(DescribeAlertTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertTypeResponseBody getBody() {
        return this.body;
    }

}
