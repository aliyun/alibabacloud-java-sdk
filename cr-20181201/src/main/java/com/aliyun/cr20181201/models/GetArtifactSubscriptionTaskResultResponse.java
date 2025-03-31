// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactSubscriptionTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetArtifactSubscriptionTaskResultResponseBody body;

    public static GetArtifactSubscriptionTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactSubscriptionTaskResultResponse self = new GetArtifactSubscriptionTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetArtifactSubscriptionTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArtifactSubscriptionTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArtifactSubscriptionTaskResultResponse setBody(GetArtifactSubscriptionTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArtifactSubscriptionTaskResultResponseBody getBody() {
        return this.body;
    }

}
