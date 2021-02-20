// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeHostAttackSurfacesFacetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHostAttackSurfacesFacetsResponseBody body;

    public static DescribeHostAttackSurfacesFacetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAttackSurfacesFacetsResponse self = new DescribeHostAttackSurfacesFacetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostAttackSurfacesFacetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostAttackSurfacesFacetsResponse setBody(DescribeHostAttackSurfacesFacetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostAttackSurfacesFacetsResponseBody getBody() {
        return this.body;
    }

}
