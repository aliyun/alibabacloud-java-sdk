// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetUrisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUrisResponseBody body;

    public static GetUrisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUrisResponse self = new GetUrisResponse();
        return TeaModel.build(map, self);
    }

    public GetUrisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUrisResponse setBody(GetUrisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUrisResponseBody getBody() {
        return this.body;
    }

}
