// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsRdsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsRdsInstancesResponseBody body;

    public static DescribeDrdsRdsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsRdsInstancesResponse self = new DescribeDrdsRdsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsRdsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsRdsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsRdsInstancesResponse setBody(DescribeDrdsRdsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsRdsInstancesResponseBody getBody() {
        return this.body;
    }

}
