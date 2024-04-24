// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsDbInstancesResponseBody body;

    public static DescribeDrdsDbInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbInstancesResponse self = new DescribeDrdsDbInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDbInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsDbInstancesResponse setBody(DescribeDrdsDbInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDbInstancesResponseBody getBody() {
        return this.body;
    }

}
