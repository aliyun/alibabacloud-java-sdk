// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeImageInstanceForIsvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageInstanceForIsvResponseBody body;

    public static DescribeImageInstanceForIsvResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInstanceForIsvResponse self = new DescribeImageInstanceForIsvResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageInstanceForIsvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageInstanceForIsvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageInstanceForIsvResponse setBody(DescribeImageInstanceForIsvResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageInstanceForIsvResponseBody getBody() {
        return this.body;
    }

}
