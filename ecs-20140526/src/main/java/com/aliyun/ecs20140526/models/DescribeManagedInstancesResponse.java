// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeManagedInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeManagedInstancesResponse setBody(DescribeManagedInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeManagedInstancesResponseBody getBody() {
        return this.body;
    }

}
