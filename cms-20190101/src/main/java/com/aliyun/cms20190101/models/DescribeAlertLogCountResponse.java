// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertLogCountResponseBody body;

    public static DescribeAlertLogCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogCountResponse self = new DescribeAlertLogCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertLogCountResponse setBody(DescribeAlertLogCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertLogCountResponseBody getBody() {
        return this.body;
    }

}
