// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLiveMessageGroupResponseBody body;

    public static ModifyLiveMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageGroupResponse self = new ModifyLiveMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLiveMessageGroupResponse setBody(ModifyLiveMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveMessageGroupResponseBody getBody() {
        return this.body;
    }

}
