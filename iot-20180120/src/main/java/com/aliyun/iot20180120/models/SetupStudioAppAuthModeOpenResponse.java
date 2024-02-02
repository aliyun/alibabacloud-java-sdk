// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetupStudioAppAuthModeOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetupStudioAppAuthModeOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetupStudioAppAuthModeOpenResponse setBody(SetupStudioAppAuthModeOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupStudioAppAuthModeOpenResponseBody getBody() {
        return this.body;
    }

}
