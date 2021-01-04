// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class RecreateClusterInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static RecreateClusterInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecreateClusterInstanceResponse self = new RecreateClusterInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RecreateClusterInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
