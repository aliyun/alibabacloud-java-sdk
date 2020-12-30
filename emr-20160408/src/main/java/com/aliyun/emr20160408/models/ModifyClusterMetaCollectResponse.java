// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterMetaCollectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterMetaCollectResponseBody body;

    public static ModifyClusterMetaCollectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterMetaCollectResponse self = new ModifyClusterMetaCollectResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterMetaCollectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterMetaCollectResponse setBody(ModifyClusterMetaCollectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterMetaCollectResponseBody getBody() {
        return this.body;
    }

}
