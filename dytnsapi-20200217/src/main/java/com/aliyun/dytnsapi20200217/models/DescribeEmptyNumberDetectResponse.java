// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeEmptyNumberDetectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEmptyNumberDetectResponseBody body;

    public static DescribeEmptyNumberDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmptyNumberDetectResponse self = new DescribeEmptyNumberDetectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEmptyNumberDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEmptyNumberDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEmptyNumberDetectResponse setBody(DescribeEmptyNumberDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEmptyNumberDetectResponseBody getBody() {
        return this.body;
    }

}
