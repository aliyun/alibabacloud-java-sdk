// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterBootstrapActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterBootstrapActionResponseBody body;

    public static ModifyClusterBootstrapActionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterBootstrapActionResponse self = new ModifyClusterBootstrapActionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterBootstrapActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterBootstrapActionResponse setBody(ModifyClusterBootstrapActionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterBootstrapActionResponseBody getBody() {
        return this.body;
    }

}
