// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastPopLocationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnycastPopLocationsResponseBody body;

    public static DescribeAnycastPopLocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastPopLocationsResponse self = new DescribeAnycastPopLocationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastPopLocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnycastPopLocationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnycastPopLocationsResponse setBody(DescribeAnycastPopLocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnycastPopLocationsResponseBody getBody() {
        return this.body;
    }

}
