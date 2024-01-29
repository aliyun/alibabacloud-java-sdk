// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGtmInstanceStatusResponseBody body;

    public static DescribeGtmInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceStatusResponse self = new DescribeGtmInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmInstanceStatusResponse setBody(DescribeGtmInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
