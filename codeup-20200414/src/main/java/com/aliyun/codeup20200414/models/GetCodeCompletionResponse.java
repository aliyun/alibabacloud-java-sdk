// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetCodeCompletionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCodeCompletionResponseBody body;

    public static GetCodeCompletionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCodeCompletionResponse self = new GetCodeCompletionResponse();
        return TeaModel.build(map, self);
    }

    public GetCodeCompletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCodeCompletionResponse setBody(GetCodeCompletionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCodeCompletionResponseBody getBody() {
        return this.body;
    }

}
