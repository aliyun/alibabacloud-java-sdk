// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DisableSceneGroupTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSceneGroupTemplateResponseBody body;

    public static DisableSceneGroupTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneGroupTemplateResponse self = new DisableSceneGroupTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DisableSceneGroupTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSceneGroupTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSceneGroupTemplateResponse setBody(DisableSceneGroupTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSceneGroupTemplateResponseBody getBody() {
        return this.body;
    }

}
