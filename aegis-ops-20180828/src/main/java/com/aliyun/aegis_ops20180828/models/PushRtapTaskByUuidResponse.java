// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushRtapTaskByUuidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushRtapTaskByUuidResponseBody body;

    public static PushRtapTaskByUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        PushRtapTaskByUuidResponse self = new PushRtapTaskByUuidResponse();
        return TeaModel.build(map, self);
    }

    public PushRtapTaskByUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushRtapTaskByUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushRtapTaskByUuidResponse setBody(PushRtapTaskByUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public PushRtapTaskByUuidResponseBody getBody() {
        return this.body;
    }

}
