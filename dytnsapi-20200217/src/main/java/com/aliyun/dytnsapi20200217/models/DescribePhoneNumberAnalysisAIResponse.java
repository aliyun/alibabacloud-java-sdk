// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisAIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberAnalysisAIResponseBody body;

    public static DescribePhoneNumberAnalysisAIResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisAIResponse self = new DescribePhoneNumberAnalysisAIResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisAIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberAnalysisAIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberAnalysisAIResponse setBody(DescribePhoneNumberAnalysisAIResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberAnalysisAIResponseBody getBody() {
        return this.body;
    }

}
