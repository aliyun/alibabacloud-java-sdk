// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsForRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventsForRegionResponseBody body;

    public static DescribeEventsForRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsForRegionResponse self = new DescribeEventsForRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventsForRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventsForRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventsForRegionResponse setBody(DescribeEventsForRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventsForRegionResponseBody getBody() {
        return this.body;
    }

}
