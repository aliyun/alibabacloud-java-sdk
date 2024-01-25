// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertContactGroupResponseBody body;

    public static DescribeAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactGroupResponse self = new DescribeAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertContactGroupResponse setBody(DescribeAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
