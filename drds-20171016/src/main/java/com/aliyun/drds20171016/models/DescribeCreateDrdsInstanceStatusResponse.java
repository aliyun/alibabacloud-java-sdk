// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeCreateDrdsInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCreateDrdsInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCreateDrdsInstanceStatusResponse setBody(DescribeCreateDrdsInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreateDrdsInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
