// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberRiskResponseBody body;

    public static DescribePhoneNumberRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberRiskResponse self = new DescribePhoneNumberRiskResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberRiskResponse setBody(DescribePhoneNumberRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberRiskResponseBody getBody() {
        return this.body;
    }

}
