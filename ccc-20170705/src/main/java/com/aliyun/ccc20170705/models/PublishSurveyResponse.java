// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PublishSurveyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishSurveyResponseBody body;

    public static PublishSurveyResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishSurveyResponse self = new PublishSurveyResponse();
        return TeaModel.build(map, self);
    }

    public PublishSurveyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishSurveyResponse setBody(PublishSurveyResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishSurveyResponseBody getBody() {
        return this.body;
    }

}
