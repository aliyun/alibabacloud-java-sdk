// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeHistoryApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
