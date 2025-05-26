// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeLLMSimilarQuestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLLMSimilarQuestionsResponseBody body;

    public static DescribeLLMSimilarQuestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLLMSimilarQuestionsResponse self = new DescribeLLMSimilarQuestionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLLMSimilarQuestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLLMSimilarQuestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLLMSimilarQuestionsResponse setBody(DescribeLLMSimilarQuestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLLMSimilarQuestionsResponseBody getBody() {
        return this.body;
    }

}
