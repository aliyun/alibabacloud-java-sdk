// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePhoneNumberStatusResponseBody body;

    public static DescribePhoneNumberStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberStatusResponse self = new DescribePhoneNumberStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberStatusResponse setBody(DescribePhoneNumberStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberStatusResponseBody getBody() {
        return this.body;
    }

}
