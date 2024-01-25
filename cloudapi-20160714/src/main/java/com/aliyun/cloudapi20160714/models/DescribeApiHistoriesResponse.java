// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiHistoriesResponseBody body;

    public static DescribeApiHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiHistoriesResponse self = new DescribeApiHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiHistoriesResponse setBody(DescribeApiHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiHistoriesResponseBody getBody() {
        return this.body;
    }

}
