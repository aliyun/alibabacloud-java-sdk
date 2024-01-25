// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeZonesResponseBody body;

    public static DescribeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponse self = new DescribeZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeZonesResponse setBody(DescribeZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeZonesResponseBody getBody() {
        return this.body;
    }

}
