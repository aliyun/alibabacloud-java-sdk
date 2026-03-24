// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CopyBroadcastSceneFromTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyBroadcastSceneFromTemplateResponseBody body;

    public static CopyBroadcastSceneFromTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyBroadcastSceneFromTemplateResponse self = new CopyBroadcastSceneFromTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CopyBroadcastSceneFromTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyBroadcastSceneFromTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyBroadcastSceneFromTemplateResponse setBody(CopyBroadcastSceneFromTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyBroadcastSceneFromTemplateResponseBody getBody() {
        return this.body;
    }

}
