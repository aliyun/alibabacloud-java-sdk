// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveAIStudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLiveAIStudioResponseBody body;

    public static CreateLiveAIStudioResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveAIStudioResponse self = new CreateLiveAIStudioResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveAIStudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveAIStudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveAIStudioResponse setBody(CreateLiveAIStudioResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveAIStudioResponseBody getBody() {
        return this.body;
    }

}
