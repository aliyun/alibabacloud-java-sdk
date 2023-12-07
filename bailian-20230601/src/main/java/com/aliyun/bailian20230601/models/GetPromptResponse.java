// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetPromptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPromptResponseBody body;

    public static GetPromptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPromptResponse self = new GetPromptResponse();
        return TeaModel.build(map, self);
    }

    public GetPromptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPromptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPromptResponse setBody(GetPromptResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPromptResponseBody getBody() {
        return this.body;
    }

}
