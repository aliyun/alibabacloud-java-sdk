// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class CreateConsoleAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConsoleAccessWhiteListResponseBody body;

    public static CreateConsoleAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsoleAccessWhiteListResponse self = new CreateConsoleAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsoleAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsoleAccessWhiteListResponse setBody(CreateConsoleAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsoleAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
