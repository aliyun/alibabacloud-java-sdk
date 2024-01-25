// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeTrafficControlsByApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrafficControlsByApiResponseBody body;

    public static DescribeTrafficControlsByApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficControlsByApiResponse self = new DescribeTrafficControlsByApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficControlsByApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrafficControlsByApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrafficControlsByApiResponse setBody(DescribeTrafficControlsByApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrafficControlsByApiResponseBody getBody() {
        return this.body;
    }

}
