// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribevSphereInventoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribevSphereInventoriesResponseBody body;

    public static DescribevSphereInventoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribevSphereInventoriesResponse self = new DescribevSphereInventoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribevSphereInventoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribevSphereInventoriesResponse setBody(DescribevSphereInventoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribevSphereInventoriesResponseBody getBody() {
        return this.body;
    }

}
