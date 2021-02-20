// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackSurfacesFacetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainAttackSurfacesFacetsResponseBody body;

    public static DescribeDomainAttackSurfacesFacetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackSurfacesFacetsResponse self = new DescribeDomainAttackSurfacesFacetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackSurfacesFacetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainAttackSurfacesFacetsResponse setBody(DescribeDomainAttackSurfacesFacetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainAttackSurfacesFacetsResponseBody getBody() {
        return this.body;
    }

}
