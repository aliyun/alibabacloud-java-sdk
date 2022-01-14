// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMcubeMiniTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeMcubeMiniTaskStatusResponseBody body;

    public static ChangeMcubeMiniTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeMiniTaskStatusResponse self = new ChangeMcubeMiniTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeMcubeMiniTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeMcubeMiniTaskStatusResponse setBody(ChangeMcubeMiniTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeMcubeMiniTaskStatusResponseBody getBody() {
        return this.body;
    }

}
