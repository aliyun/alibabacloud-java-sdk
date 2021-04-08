// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetMcuLvsIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMcuLvsIpResponseBody body;

    public static GetMcuLvsIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcuLvsIpResponse self = new GetMcuLvsIpResponse();
        return TeaModel.build(map, self);
    }

    public GetMcuLvsIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcuLvsIpResponse setBody(GetMcuLvsIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcuLvsIpResponseBody getBody() {
        return this.body;
    }

}
