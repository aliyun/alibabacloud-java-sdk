// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSimQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSimQuestionResponseBody body;

    public static UpdateSimQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSimQuestionResponse self = new UpdateSimQuestionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSimQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSimQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSimQuestionResponse setBody(UpdateSimQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSimQuestionResponseBody getBody() {
        return this.body;
    }

}
