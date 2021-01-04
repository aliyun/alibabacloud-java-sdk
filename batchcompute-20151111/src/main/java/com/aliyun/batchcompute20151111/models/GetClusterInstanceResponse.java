// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class GetClusterInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static GetClusterInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInstanceResponse self = new GetClusterInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
