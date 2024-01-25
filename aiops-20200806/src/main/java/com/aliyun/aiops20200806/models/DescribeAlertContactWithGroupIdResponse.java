// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactWithGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertContactWithGroupIdResponseBody body;

    public static DescribeAlertContactWithGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactWithGroupIdResponse self = new DescribeAlertContactWithGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactWithGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertContactWithGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertContactWithGroupIdResponse setBody(DescribeAlertContactWithGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertContactWithGroupIdResponseBody getBody() {
        return this.body;
    }

}
