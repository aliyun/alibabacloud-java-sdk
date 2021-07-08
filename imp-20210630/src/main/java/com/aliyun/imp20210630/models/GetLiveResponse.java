// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveResponseBody body;

    public static GetLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveResponse self = new GetLiveResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveResponse setBody(GetLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveResponseBody getBody() {
        return this.body;
    }

}
