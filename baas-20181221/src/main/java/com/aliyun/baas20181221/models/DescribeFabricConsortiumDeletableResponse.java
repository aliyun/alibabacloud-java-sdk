// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumDeletableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricConsortiumDeletableResponseBody body;

    public static DescribeFabricConsortiumDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumDeletableResponse self = new DescribeFabricConsortiumDeletableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumDeletableResponse setBody(DescribeFabricConsortiumDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumDeletableResponseBody getBody() {
        return this.body;
    }

}
