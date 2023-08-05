// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class CreateRtapCmdDispatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRtapCmdDispatchTaskResponseBody body;

    public static CreateRtapCmdDispatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRtapCmdDispatchTaskResponse self = new CreateRtapCmdDispatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRtapCmdDispatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRtapCmdDispatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRtapCmdDispatchTaskResponse setBody(CreateRtapCmdDispatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRtapCmdDispatchTaskResponseBody getBody() {
        return this.body;
    }

}
