// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePhoneNumberAnalysisResponse setBody(DescribePhoneNumberAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneNumberAnalysisResponseBody getBody() {
        return this.body;
    }

}
