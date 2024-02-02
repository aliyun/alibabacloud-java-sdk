// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberAnalysisResponseBody body;

    public static DescribePhoneNumberAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisResponse self = new DescribePhoneNumberAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberAnalysisResponse setBody(DescribePhoneNumberAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberAnalysisResponseBody getBody() {
        return this.body;
    }

}
