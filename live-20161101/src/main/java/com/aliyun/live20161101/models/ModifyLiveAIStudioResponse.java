// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveAIStudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLiveAIStudioResponseBody body;

    public static ModifyLiveAIStudioResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveAIStudioResponse self = new ModifyLiveAIStudioResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveAIStudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveAIStudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLiveAIStudioResponse setBody(ModifyLiveAIStudioResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveAIStudioResponseBody getBody() {
        return this.body;
    }

}
