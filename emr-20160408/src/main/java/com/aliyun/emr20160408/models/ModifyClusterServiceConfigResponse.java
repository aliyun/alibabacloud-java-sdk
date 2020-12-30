// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterServiceConfigResponseBody body;

    public static ModifyClusterServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterServiceConfigResponse self = new ModifyClusterServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterServiceConfigResponse setBody(ModifyClusterServiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterServiceConfigResponseBody getBody() {
        return this.body;
    }

}
