// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeMyBaseHostOverViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMyBaseHostOverViewResponseBody body;

    public static DescribeMyBaseHostOverViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBaseHostOverViewResponse self = new DescribeMyBaseHostOverViewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMyBaseHostOverViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMyBaseHostOverViewResponse setBody(DescribeMyBaseHostOverViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMyBaseHostOverViewResponseBody getBody() {
        return this.body;
    }

}
