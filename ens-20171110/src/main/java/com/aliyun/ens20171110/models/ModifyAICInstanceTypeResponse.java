// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyAICInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAICInstanceTypeResponseBody body;

    public static ModifyAICInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAICInstanceTypeResponse self = new ModifyAICInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAICInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAICInstanceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAICInstanceTypeResponse setBody(ModifyAICInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAICInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
