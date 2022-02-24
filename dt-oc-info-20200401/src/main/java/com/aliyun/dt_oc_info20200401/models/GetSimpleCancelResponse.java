// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetSimpleCancelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSimpleCancelResponseBody body;

    public static GetSimpleCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSimpleCancelResponse self = new GetSimpleCancelResponse();
        return TeaModel.build(map, self);
    }

    public GetSimpleCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSimpleCancelResponse setBody(GetSimpleCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSimpleCancelResponseBody getBody() {
        return this.body;
    }

}
