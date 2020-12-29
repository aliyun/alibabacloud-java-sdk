// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumSpecsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricConsortiumSpecsResponseBody body;

    public static DescribeFabricConsortiumSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumSpecsResponse self = new DescribeFabricConsortiumSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumSpecsResponse setBody(DescribeFabricConsortiumSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumSpecsResponseBody getBody() {
        return this.body;
    }

}
