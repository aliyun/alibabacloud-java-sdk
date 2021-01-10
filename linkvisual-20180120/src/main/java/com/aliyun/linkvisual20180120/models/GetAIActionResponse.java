// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAIActionResponseBody body;

    public static GetAIActionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionResponse self = new GetAIActionResponse();
        return TeaModel.build(map, self);
    }

    public GetAIActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIActionResponse setBody(GetAIActionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIActionResponseBody getBody() {
        return this.body;
    }

}
