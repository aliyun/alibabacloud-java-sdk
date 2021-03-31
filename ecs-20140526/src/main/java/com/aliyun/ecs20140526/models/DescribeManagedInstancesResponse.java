// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeManagedInstancesResponseBody body;

    public static DescribeManagedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedInstancesResponse self = new DescribeManagedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeManagedInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeManagedInstancesResponse setBody(DescribeManagedInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeManagedInstancesResponseBody getBody() {
        return this.body;
    }

}
