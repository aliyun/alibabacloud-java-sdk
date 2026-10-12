// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateMobileAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMobileAgentTaskResponseBody body;

    public static CreateMobileAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMobileAgentTaskResponse self = new CreateMobileAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMobileAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMobileAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMobileAgentTaskResponse setBody(CreateMobileAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMobileAgentTaskResponseBody getBody() {
        return this.body;
    }

}
