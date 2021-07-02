// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteComputeApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoteComputeApiResponseBody body;

    public static RemoteComputeApiResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoteComputeApiResponse self = new RemoteComputeApiResponse();
        return TeaModel.build(map, self);
    }

    public RemoteComputeApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoteComputeApiResponse setBody(RemoteComputeApiResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoteComputeApiResponseBody getBody() {
        return this.body;
    }

}
