// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAIAppResponseBody body;

    public static GetAIAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIAppResponse self = new GetAIAppResponse();
        return TeaModel.build(map, self);
    }

    public GetAIAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIAppResponse setBody(GetAIAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIAppResponseBody getBody() {
        return this.body;
    }

}
