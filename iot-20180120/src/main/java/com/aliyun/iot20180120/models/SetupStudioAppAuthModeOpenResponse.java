// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetupStudioAppAuthModeOpenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetupStudioAppAuthModeOpenResponseBody body;

    public static SetupStudioAppAuthModeOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupStudioAppAuthModeOpenResponse self = new SetupStudioAppAuthModeOpenResponse();
        return TeaModel.build(map, self);
    }

    public SetupStudioAppAuthModeOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetupStudioAppAuthModeOpenResponse setBody(SetupStudioAppAuthModeOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupStudioAppAuthModeOpenResponseBody getBody() {
        return this.body;
    }

}
