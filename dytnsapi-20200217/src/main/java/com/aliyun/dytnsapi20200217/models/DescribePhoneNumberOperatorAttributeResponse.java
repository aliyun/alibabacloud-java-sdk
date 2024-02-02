// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberOperatorAttributeResponseBody body;

    public static DescribePhoneNumberOperatorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeResponse self = new DescribePhoneNumberOperatorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberOperatorAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberOperatorAttributeResponse setBody(DescribePhoneNumberOperatorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberOperatorAttributeResponseBody getBody() {
        return this.body;
    }

}
