// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertsResponseBody body;

    public static DescribeAlertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsResponse self = new DescribeAlertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertsResponse setBody(DescribeAlertsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertsResponseBody getBody() {
        return this.body;
    }

}
