// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContainerGroupStatusResponseBody body;

    public static DescribeContainerGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupStatusResponse self = new DescribeContainerGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerGroupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerGroupStatusResponse setBody(DescribeContainerGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerGroupStatusResponseBody getBody() {
        return this.body;
    }

}
