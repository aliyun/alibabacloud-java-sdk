// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeHistoryApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHistoryApiResponseBody body;

    public static DescribeHistoryApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryApiResponse self = new DescribeHistoryApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHistoryApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHistoryApiResponse setBody(DescribeHistoryApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHistoryApiResponseBody getBody() {
        return this.body;
    }

}
