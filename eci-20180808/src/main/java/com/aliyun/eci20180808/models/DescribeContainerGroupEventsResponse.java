// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerGroupEventsResponseBody body;

    public static DescribeContainerGroupEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupEventsResponse self = new DescribeContainerGroupEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerGroupEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerGroupEventsResponse setBody(DescribeContainerGroupEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerGroupEventsResponseBody getBody() {
        return this.body;
    }

}
