// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLiveMessageUserInfoResponseBody body;

    public static ModifyLiveMessageUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageUserInfoResponse self = new ModifyLiveMessageUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveMessageUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLiveMessageUserInfoResponse setBody(ModifyLiveMessageUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveMessageUserInfoResponseBody getBody() {
        return this.body;
    }

}
