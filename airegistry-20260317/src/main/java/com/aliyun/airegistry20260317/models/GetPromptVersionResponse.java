// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetPromptVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPromptVersionResponseBody body;

    public static GetPromptVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPromptVersionResponse self = new GetPromptVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetPromptVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPromptVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPromptVersionResponse setBody(GetPromptVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPromptVersionResponseBody getBody() {
        return this.body;
    }

}
