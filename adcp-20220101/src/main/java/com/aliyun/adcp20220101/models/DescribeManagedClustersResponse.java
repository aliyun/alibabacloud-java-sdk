// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeManagedClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeManagedClustersResponseBody body;

    public static DescribeManagedClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedClustersResponse self = new DescribeManagedClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeManagedClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeManagedClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeManagedClustersResponse setBody(DescribeManagedClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeManagedClustersResponseBody getBody() {
        return this.body;
    }

}
