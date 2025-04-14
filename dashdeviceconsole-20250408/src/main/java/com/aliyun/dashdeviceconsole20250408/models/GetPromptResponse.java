// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408.models;

import com.aliyun.tea.*;

public class GetPromptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
