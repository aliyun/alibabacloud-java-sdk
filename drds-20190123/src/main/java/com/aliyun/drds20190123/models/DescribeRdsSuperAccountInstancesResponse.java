// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsSuperAccountInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsSuperAccountInstancesResponseBody body;

    public static DescribeRdsSuperAccountInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsSuperAccountInstancesResponse self = new DescribeRdsSuperAccountInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsSuperAccountInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsSuperAccountInstancesResponse setBody(DescribeRdsSuperAccountInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsSuperAccountInstancesResponseBody getBody() {
        return this.body;
    }

}
