// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactSubscriptionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateArtifactSubscriptionTaskResponseBody body;

    public static CreateArtifactSubscriptionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactSubscriptionTaskResponse self = new CreateArtifactSubscriptionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateArtifactSubscriptionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateArtifactSubscriptionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateArtifactSubscriptionTaskResponse setBody(CreateArtifactSubscriptionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateArtifactSubscriptionTaskResponseBody getBody() {
        return this.body;
    }

}
