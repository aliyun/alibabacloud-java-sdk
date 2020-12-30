// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateGetDBListFromAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGetDBListFromAgentTaskResponseBody body;

    public static CreateGetDBListFromAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGetDBListFromAgentTaskResponse self = new CreateGetDBListFromAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateGetDBListFromAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGetDBListFromAgentTaskResponse setBody(CreateGetDBListFromAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGetDBListFromAgentTaskResponseBody getBody() {
        return this.body;
    }

}
