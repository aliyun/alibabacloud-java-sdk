// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateLayer4RuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLayer4RuleResponseBody body;

    public static UpdateLayer4RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLayer4RuleResponse self = new UpdateLayer4RuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLayer4RuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLayer4RuleResponse setBody(UpdateLayer4RuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLayer4RuleResponseBody getBody() {
        return this.body;
    }

}
