// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySlsDispatchConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySlsDispatchConfigResponseBody body;

    public static ModifySlsDispatchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySlsDispatchConfigResponse self = new ModifySlsDispatchConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifySlsDispatchConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySlsDispatchConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySlsDispatchConfigResponse setBody(ModifySlsDispatchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySlsDispatchConfigResponseBody getBody() {
        return this.body;
    }

}
