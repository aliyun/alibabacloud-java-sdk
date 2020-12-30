// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceStateResponseBody body;

    public static GetInstanceStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStateResponse self = new GetInstanceStateResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceStateResponse setBody(GetInstanceStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceStateResponseBody getBody() {
        return this.body;
    }

}
