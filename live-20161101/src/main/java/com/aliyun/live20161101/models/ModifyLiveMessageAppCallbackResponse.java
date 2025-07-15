// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLiveMessageAppCallbackResponseBody body;

    public static ModifyLiveMessageAppCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppCallbackResponse self = new ModifyLiveMessageAppCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveMessageAppCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLiveMessageAppCallbackResponse setBody(ModifyLiveMessageAppCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveMessageAppCallbackResponseBody getBody() {
        return this.body;
    }

}
