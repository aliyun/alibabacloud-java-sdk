// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsDBsResponseBody body;

    public static DescribeDrdsDBsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBsResponse self = new DescribeDrdsDBsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDBsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsDBsResponse setBody(DescribeDrdsDBsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDBsResponseBody getBody() {
        return this.body;
    }

}
