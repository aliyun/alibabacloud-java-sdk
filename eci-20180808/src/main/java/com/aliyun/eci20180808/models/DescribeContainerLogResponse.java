// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerLogResponseBody body;

    public static DescribeContainerLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerLogResponse self = new DescribeContainerLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerLogResponse setBody(DescribeContainerLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerLogResponseBody getBody() {
        return this.body;
    }

}
