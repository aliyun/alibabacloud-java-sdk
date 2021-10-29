// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeCreateDrdsInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCreateDrdsInstanceStatusResponseBody body;

    public static DescribeCreateDrdsInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreateDrdsInstanceStatusResponse self = new DescribeCreateDrdsInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreateDrdsInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCreateDrdsInstanceStatusResponse setBody(DescribeCreateDrdsInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreateDrdsInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
