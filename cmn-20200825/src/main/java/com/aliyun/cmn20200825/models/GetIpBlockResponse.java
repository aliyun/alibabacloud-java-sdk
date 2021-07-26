// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpBlockResponseBody body;

    public static GetIpBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpBlockResponse self = new GetIpBlockResponse();
        return TeaModel.build(map, self);
    }

    public GetIpBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpBlockResponse setBody(GetIpBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpBlockResponseBody getBody() {
        return this.body;
    }

}
