// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyVirtualBridgeLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVirtualBridgeLevelResponseBody body;

    public static ModifyVirtualBridgeLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBridgeLevelResponse self = new ModifyVirtualBridgeLevelResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBridgeLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVirtualBridgeLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVirtualBridgeLevelResponse setBody(ModifyVirtualBridgeLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVirtualBridgeLevelResponseBody getBody() {
        return this.body;
    }

}
