// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateGetDBListFromAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateGetDBListFromAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGetDBListFromAgentTaskResponse setBody(CreateGetDBListFromAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGetDBListFromAgentTaskResponseBody getBody() {
        return this.body;
    }

}
