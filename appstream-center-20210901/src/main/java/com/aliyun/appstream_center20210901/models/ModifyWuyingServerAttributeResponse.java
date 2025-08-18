// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyWuyingServerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWuyingServerAttributeResponseBody body;

    public static ModifyWuyingServerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWuyingServerAttributeResponse self = new ModifyWuyingServerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWuyingServerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWuyingServerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWuyingServerAttributeResponse setBody(ModifyWuyingServerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWuyingServerAttributeResponseBody getBody() {
        return this.body;
    }

}
