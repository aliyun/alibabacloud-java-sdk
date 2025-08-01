// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppDisableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLiveMessageAppDisableResponseBody body;

    public static ModifyLiveMessageAppDisableResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppDisableResponse self = new ModifyLiveMessageAppDisableResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppDisableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveMessageAppDisableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLiveMessageAppDisableResponse setBody(ModifyLiveMessageAppDisableResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveMessageAppDisableResponseBody getBody() {
        return this.body;
    }

}
