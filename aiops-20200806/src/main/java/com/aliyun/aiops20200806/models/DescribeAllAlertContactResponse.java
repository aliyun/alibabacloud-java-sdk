// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllAlertContactResponseBody body;

    public static DescribeAllAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAlertContactResponse self = new DescribeAllAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllAlertContactResponse setBody(DescribeAllAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllAlertContactResponseBody getBody() {
        return this.body;
    }

}
