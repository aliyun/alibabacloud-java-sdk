// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeFunctionFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFunctionFeedbackResponseBody body;

    public static DescribeFunctionFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFunctionFeedbackResponse self = new DescribeFunctionFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFunctionFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFunctionFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFunctionFeedbackResponse setBody(DescribeFunctionFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFunctionFeedbackResponseBody getBody() {
        return this.body;
    }

}
