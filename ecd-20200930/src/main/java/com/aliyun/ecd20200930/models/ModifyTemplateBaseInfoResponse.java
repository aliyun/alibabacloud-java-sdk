// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyTemplateBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTemplateBaseInfoResponseBody body;

    public static ModifyTemplateBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateBaseInfoResponse self = new ModifyTemplateBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTemplateBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTemplateBaseInfoResponse setBody(ModifyTemplateBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTemplateBaseInfoResponseBody getBody() {
        return this.body;
    }

}
