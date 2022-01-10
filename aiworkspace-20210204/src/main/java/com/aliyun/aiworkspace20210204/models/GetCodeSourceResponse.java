// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetCodeSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCodeSourceResponseBody body;

    public static GetCodeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCodeSourceResponse self = new GetCodeSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetCodeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCodeSourceResponse setBody(GetCodeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCodeSourceResponseBody getBody() {
        return this.body;
    }

}
