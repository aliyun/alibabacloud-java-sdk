// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeAnnualResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberOperatorAttributeAnnualResponseBody body;

    public static DescribePhoneNumberOperatorAttributeAnnualResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeAnnualResponse self = new DescribePhoneNumberOperatorAttributeAnnualResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeAnnualResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberOperatorAttributeAnnualResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberOperatorAttributeAnnualResponse setBody(DescribePhoneNumberOperatorAttributeAnnualResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberOperatorAttributeAnnualResponseBody getBody() {
        return this.body;
    }

}
