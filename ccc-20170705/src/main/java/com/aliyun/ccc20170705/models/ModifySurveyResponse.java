// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySurveyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySurveyResponseBody body;

    public static ModifySurveyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySurveyResponse self = new ModifySurveyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySurveyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySurveyResponse setBody(ModifySurveyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySurveyResponseBody getBody() {
        return this.body;
    }

}
