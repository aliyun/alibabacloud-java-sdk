// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceMirrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMirrorResponseBody body;

    public static DescribeServiceMirrorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMirrorResponse self = new DescribeServiceMirrorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMirrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMirrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceMirrorResponse setBody(DescribeServiceMirrorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMirrorResponseBody getBody() {
        return this.body;
    }

}
