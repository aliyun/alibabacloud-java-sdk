// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterResponseBody body;

    public static ModifyClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterResponse self = new ModifyClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterResponse setBody(ModifyClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterResponseBody getBody() {
        return this.body;
    }

}
