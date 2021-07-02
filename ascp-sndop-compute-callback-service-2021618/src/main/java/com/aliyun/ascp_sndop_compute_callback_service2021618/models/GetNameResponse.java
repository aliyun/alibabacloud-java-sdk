// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class GetNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNameResponseBody body;

    public static GetNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNameResponse self = new GetNameResponse();
        return TeaModel.build(map, self);
    }

    public GetNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNameResponse setBody(GetNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNameResponseBody getBody() {
        return this.body;
    }

}
