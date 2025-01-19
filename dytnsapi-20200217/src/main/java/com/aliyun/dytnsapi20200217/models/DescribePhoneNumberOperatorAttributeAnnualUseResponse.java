// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeAnnualUseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBody body;

    public static DescribePhoneNumberOperatorAttributeAnnualUseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeAnnualUseResponse self = new DescribePhoneNumberOperatorAttributeAnnualUseResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseResponse setBody(DescribePhoneNumberOperatorAttributeAnnualUseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBody getBody() {
        return this.body;
    }

}
