// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateAndPublishAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAndPublishAgentResponseBody body;

    public static UpdateAndPublishAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndPublishAgentResponse self = new UpdateAndPublishAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAndPublishAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAndPublishAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAndPublishAgentResponse setBody(UpdateAndPublishAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAndPublishAgentResponseBody getBody() {
        return this.body;
    }

}
