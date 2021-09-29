// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ExecuteCameraShootingCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteCameraShootingCommandResponseBody body;

    public static ExecuteCameraShootingCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteCameraShootingCommandResponse self = new ExecuteCameraShootingCommandResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteCameraShootingCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteCameraShootingCommandResponse setBody(ExecuteCameraShootingCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteCameraShootingCommandResponseBody getBody() {
        return this.body;
    }

}
