// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAppInstanceGroupAttributeResponseBody body;

    public static ModifyAppInstanceGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceGroupAttributeResponse self = new ModifyAppInstanceGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppInstanceGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppInstanceGroupAttributeResponse setBody(ModifyAppInstanceGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppInstanceGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
