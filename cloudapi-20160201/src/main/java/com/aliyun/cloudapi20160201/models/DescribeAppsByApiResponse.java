// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAppsByApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppsByApiResponseBody body;

    public static DescribeAppsByApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsByApiResponse self = new DescribeAppsByApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppsByApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppsByApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppsByApiResponse setBody(DescribeAppsByApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppsByApiResponseBody getBody() {
        return this.body;
    }

}
