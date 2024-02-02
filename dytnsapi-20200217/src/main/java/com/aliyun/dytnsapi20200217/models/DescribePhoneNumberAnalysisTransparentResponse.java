// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisTransparentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePhoneNumberAnalysisTransparentResponseBody body;

    public static DescribePhoneNumberAnalysisTransparentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisTransparentResponse self = new DescribePhoneNumberAnalysisTransparentResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisTransparentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneNumberAnalysisTransparentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePhoneNumberAnalysisTransparentResponse setBody(DescribePhoneNumberAnalysisTransparentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberAnalysisTransparentResponseBody getBody() {
        return this.body;
    }

}
