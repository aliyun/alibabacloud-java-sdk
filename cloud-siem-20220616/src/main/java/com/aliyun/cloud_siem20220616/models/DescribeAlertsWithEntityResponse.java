// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsWithEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertsWithEntityResponseBody body;

    public static DescribeAlertsWithEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsWithEntityResponse self = new DescribeAlertsWithEntityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsWithEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertsWithEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertsWithEntityResponse setBody(DescribeAlertsWithEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertsWithEntityResponseBody getBody() {
        return this.body;
    }

}
