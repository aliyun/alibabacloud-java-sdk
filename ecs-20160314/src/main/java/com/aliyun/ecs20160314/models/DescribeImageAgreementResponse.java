// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeImageAgreementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageAgreementResponseBody body;

    public static DescribeImageAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageAgreementResponse self = new DescribeImageAgreementResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageAgreementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageAgreementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageAgreementResponse setBody(DescribeImageAgreementResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageAgreementResponseBody getBody() {
        return this.body;
    }

}
