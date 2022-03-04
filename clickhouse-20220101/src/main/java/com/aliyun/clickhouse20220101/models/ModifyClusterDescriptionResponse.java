// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyClusterDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterDescriptionResponseBody body;

    public static ModifyClusterDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDescriptionResponse self = new ModifyClusterDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterDescriptionResponse setBody(ModifyClusterDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterDescriptionResponseBody getBody() {
        return this.body;
    }

}
