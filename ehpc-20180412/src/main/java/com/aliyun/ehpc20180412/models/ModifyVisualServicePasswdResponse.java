// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyVisualServicePasswdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVisualServicePasswdResponseBody body;

    public static ModifyVisualServicePasswdResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVisualServicePasswdResponse self = new ModifyVisualServicePasswdResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVisualServicePasswdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVisualServicePasswdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVisualServicePasswdResponse setBody(ModifyVisualServicePasswdResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVisualServicePasswdResponseBody getBody() {
        return this.body;
    }

}
