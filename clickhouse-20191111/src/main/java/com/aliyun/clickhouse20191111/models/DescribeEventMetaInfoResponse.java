// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeEventMetaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventMetaInfoResponseBody body;

    public static DescribeEventMetaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventMetaInfoResponse self = new DescribeEventMetaInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventMetaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventMetaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventMetaInfoResponse setBody(DescribeEventMetaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventMetaInfoResponseBody getBody() {
        return this.body;
    }

}
