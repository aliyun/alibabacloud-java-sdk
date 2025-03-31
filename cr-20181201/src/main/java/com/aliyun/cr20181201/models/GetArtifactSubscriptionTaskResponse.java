// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactSubscriptionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArtifactSubscriptionTaskResponseBody body;

    public static GetArtifactSubscriptionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactSubscriptionTaskResponse self = new GetArtifactSubscriptionTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactSubscriptionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactSubscriptionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactSubscriptionTaskResponse setBody(GetArtifactSubscriptionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactSubscriptionTaskResponseBody getBody() {
        return this.body;
    }

}
