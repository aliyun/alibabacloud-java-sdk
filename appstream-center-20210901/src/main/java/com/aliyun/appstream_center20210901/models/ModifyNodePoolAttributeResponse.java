// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNodePoolAttributeResponseBody body;

    public static ModifyNodePoolAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolAttributeResponse self = new ModifyNodePoolAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNodePoolAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNodePoolAttributeResponse setBody(ModifyNodePoolAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNodePoolAttributeResponseBody getBody() {
        return this.body;
    }

}
