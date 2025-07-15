// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAIStudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveAIStudioResponseBody body;

    public static DeleteLiveAIStudioResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAIStudioResponse self = new DeleteLiveAIStudioResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAIStudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveAIStudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveAIStudioResponse setBody(DeleteLiveAIStudioResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveAIStudioResponseBody getBody() {
        return this.body;
    }

}
