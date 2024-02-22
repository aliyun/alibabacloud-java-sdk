// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertsCountResponseBody body;

    public static DescribeAlertsCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsCountResponse self = new DescribeAlertsCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertsCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertsCountResponse setBody(DescribeAlertsCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertsCountResponseBody getBody() {
        return this.body;
    }

}
