// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactSubscriptionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListArtifactSubscriptionTaskResponseBody body;

    public static ListArtifactSubscriptionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactSubscriptionTaskResponse self = new ListArtifactSubscriptionTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListArtifactSubscriptionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListArtifactSubscriptionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListArtifactSubscriptionTaskResponse setBody(ListArtifactSubscriptionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArtifactSubscriptionTaskResponseBody getBody() {
        return this.body;
    }

}
