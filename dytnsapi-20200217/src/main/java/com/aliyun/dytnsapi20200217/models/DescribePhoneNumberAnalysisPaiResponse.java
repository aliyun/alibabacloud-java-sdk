// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisPaiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberAnalysisPaiResponseBody body;

    public static DescribePhoneNumberAnalysisPaiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisPaiResponse self = new DescribePhoneNumberAnalysisPaiResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisPaiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberAnalysisPaiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberAnalysisPaiResponse setBody(DescribePhoneNumberAnalysisPaiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberAnalysisPaiResponseBody getBody() {
        return this.body;
    }

}
