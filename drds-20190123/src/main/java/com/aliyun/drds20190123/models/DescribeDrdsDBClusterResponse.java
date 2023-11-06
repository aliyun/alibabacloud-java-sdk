// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsDBClusterResponseBody body;

    public static DescribeDrdsDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBClusterResponse self = new DescribeDrdsDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsDBClusterResponse setBody(DescribeDrdsDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDBClusterResponseBody getBody() {
        return this.body;
    }

}
