// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricInviterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricInviterResponseBody body;

    public static DescribeFabricInviterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricInviterResponse self = new DescribeFabricInviterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricInviterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricInviterResponse setBody(DescribeFabricInviterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricInviterResponseBody getBody() {
        return this.body;
    }

}
