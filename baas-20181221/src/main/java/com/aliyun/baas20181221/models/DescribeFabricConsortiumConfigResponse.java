// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricConsortiumConfigResponseBody body;

    public static DescribeFabricConsortiumConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumConfigResponse self = new DescribeFabricConsortiumConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricConsortiumConfigResponse setBody(DescribeFabricConsortiumConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricConsortiumConfigResponseBody getBody() {
        return this.body;
    }

}
