// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAIActionConfigResponseBody body;

    public static GetAIActionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionConfigResponse self = new GetAIActionConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAIActionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIActionConfigResponse setBody(GetAIActionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIActionConfigResponseBody getBody() {
        return this.body;
    }

}
