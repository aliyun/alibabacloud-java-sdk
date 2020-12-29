// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricConsortiumsResponseBody body;

    public static DescribeFabricConsortiumsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumsResponse self = new DescribeFabricConsortiumsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumsResponse setBody(DescribeFabricConsortiumsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumsResponseBody getBody() {
        return this.body;
    }

}
