// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class EnableSceneGroupTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSceneGroupTemplateResponseBody body;

    public static EnableSceneGroupTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneGroupTemplateResponse self = new EnableSceneGroupTemplateResponse();
        return TeaModel.build(map, self);
    }

    public EnableSceneGroupTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSceneGroupTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSceneGroupTemplateResponse setBody(EnableSceneGroupTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSceneGroupTemplateResponseBody getBody() {
        return this.body;
    }

}
