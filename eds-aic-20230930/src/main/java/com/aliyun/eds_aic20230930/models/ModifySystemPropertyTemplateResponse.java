// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifySystemPropertyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySystemPropertyTemplateResponseBody body;

    public static ModifySystemPropertyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemPropertyTemplateResponse self = new ModifySystemPropertyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifySystemPropertyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySystemPropertyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySystemPropertyTemplateResponse setBody(ModifySystemPropertyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySystemPropertyTemplateResponseBody getBody() {
        return this.body;
    }

}
