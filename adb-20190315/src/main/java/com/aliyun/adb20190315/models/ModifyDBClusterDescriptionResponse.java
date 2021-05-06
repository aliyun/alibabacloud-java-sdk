// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterDescriptionResponseBody body;

    public static ModifyDBClusterDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionResponse self = new ModifyDBClusterDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterDescriptionResponse setBody(ModifyDBClusterDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterDescriptionResponseBody getBody() {
        return this.body;
    }

}
