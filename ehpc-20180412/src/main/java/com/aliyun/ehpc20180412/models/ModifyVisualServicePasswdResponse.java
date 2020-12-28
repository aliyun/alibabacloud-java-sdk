// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyVisualServicePasswdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyVisualServicePasswdResponse setBody(ModifyVisualServicePasswdResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVisualServicePasswdResponseBody getBody() {
        return this.body;
    }

}
