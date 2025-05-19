// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeAlarmsForResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlarmsForResourcesResponseBody body;

    public static DescribeAlarmsForResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsForResourcesResponse self = new DescribeAlarmsForResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsForResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlarmsForResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlarmsForResourcesResponse setBody(DescribeAlarmsForResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlarmsForResourcesResponseBody getBody() {
        return this.body;
    }

}
