// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsDrdsDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsDrdsDBResponseBody body;

    public static DescribeRdsDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsDrdsDBResponse self = new DescribeRdsDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsDrdsDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsDrdsDBResponse setBody(DescribeRdsDrdsDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsDrdsDBResponseBody getBody() {
        return this.body;
    }

}
