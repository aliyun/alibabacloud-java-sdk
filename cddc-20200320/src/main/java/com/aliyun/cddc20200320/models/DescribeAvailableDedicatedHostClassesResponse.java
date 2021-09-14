// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostClassesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableDedicatedHostClassesResponseBody body;

    public static DescribeAvailableDedicatedHostClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostClassesResponse self = new DescribeAvailableDedicatedHostClassesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableDedicatedHostClassesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableDedicatedHostClassesResponse setBody(DescribeAvailableDedicatedHostClassesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableDedicatedHostClassesResponseBody getBody() {
        return this.body;
    }

}
