// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class ListRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static ListRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponse self = new ListRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
