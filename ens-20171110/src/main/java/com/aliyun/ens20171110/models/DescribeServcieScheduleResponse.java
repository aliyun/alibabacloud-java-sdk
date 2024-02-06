// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServcieScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServcieScheduleResponseBody body;

    public static DescribeServcieScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServcieScheduleResponse self = new DescribeServcieScheduleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServcieScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServcieScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServcieScheduleResponse setBody(DescribeServcieScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServcieScheduleResponseBody getBody() {
        return this.body;
    }

}
