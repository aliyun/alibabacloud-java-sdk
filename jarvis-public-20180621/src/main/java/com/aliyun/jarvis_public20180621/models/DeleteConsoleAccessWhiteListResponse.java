// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DeleteConsoleAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConsoleAccessWhiteListResponseBody body;

    public static DeleteConsoleAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsoleAccessWhiteListResponse self = new DeleteConsoleAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConsoleAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConsoleAccessWhiteListResponse setBody(DeleteConsoleAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsoleAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
