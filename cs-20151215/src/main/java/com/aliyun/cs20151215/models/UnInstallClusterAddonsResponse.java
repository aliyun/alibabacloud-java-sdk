// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static UnInstallClusterAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnInstallClusterAddonsResponse self = new UnInstallClusterAddonsResponse();
        return TeaModel.build(map, self);
    }

    public UnInstallClusterAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
