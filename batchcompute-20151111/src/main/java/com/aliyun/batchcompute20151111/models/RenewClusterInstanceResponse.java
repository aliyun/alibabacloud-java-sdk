// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class RenewClusterInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static RenewClusterInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewClusterInstanceResponse self = new RenewClusterInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewClusterInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
