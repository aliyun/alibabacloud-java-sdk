// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllAlertContactGroupResponseBody body;

    public static DescribeAllAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAlertContactGroupResponse self = new DescribeAllAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllAlertContactGroupResponse setBody(DescribeAllAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
