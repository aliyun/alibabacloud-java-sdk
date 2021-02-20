// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeAttackSurfacesFacetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAttackSurfacesFacetsResponseBody body;

    public static DescribeAttackSurfacesFacetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackSurfacesFacetsResponse self = new DescribeAttackSurfacesFacetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttackSurfacesFacetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttackSurfacesFacetsResponse setBody(DescribeAttackSurfacesFacetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttackSurfacesFacetsResponseBody getBody() {
        return this.body;
    }

}
