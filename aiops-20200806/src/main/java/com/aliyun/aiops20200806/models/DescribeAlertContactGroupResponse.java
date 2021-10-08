// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAlertContactGroupResponse setBody(DescribeAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
