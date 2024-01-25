// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeHistoryApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHistoryApisResponseBody body;

    public static DescribeHistoryApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryApisResponse self = new DescribeHistoryApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHistoryApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHistoryApisResponse setBody(DescribeHistoryApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHistoryApisResponseBody getBody() {
        return this.body;
    }

}
