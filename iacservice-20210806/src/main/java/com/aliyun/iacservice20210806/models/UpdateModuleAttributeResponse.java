// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateModuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModuleAttributeResponseBody body;

    public static UpdateModuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleAttributeResponse self = new UpdateModuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModuleAttributeResponse setBody(UpdateModuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModuleAttributeResponseBody getBody() {
        return this.body;
    }

}
