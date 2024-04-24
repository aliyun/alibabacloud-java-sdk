// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsInstancesResponseBody body;

    public static DescribeDrdsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstancesResponse self = new DescribeDrdsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsInstancesResponse setBody(DescribeDrdsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstancesResponseBody getBody() {
        return this.body;
    }

}
