// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DeleteSurveyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSurveyResponseBody body;

    public static DeleteSurveyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSurveyResponse self = new DeleteSurveyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSurveyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSurveyResponse setBody(DeleteSurveyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSurveyResponseBody getBody() {
        return this.body;
    }

}
