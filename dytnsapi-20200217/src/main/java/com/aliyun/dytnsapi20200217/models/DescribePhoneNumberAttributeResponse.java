// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberAttributeResponseBody body;

    public static DescribePhoneNumberAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAttributeResponse self = new DescribePhoneNumberAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberAttributeResponse setBody(DescribePhoneNumberAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberAttributeResponseBody getBody() {
        return this.body;
    }

}
