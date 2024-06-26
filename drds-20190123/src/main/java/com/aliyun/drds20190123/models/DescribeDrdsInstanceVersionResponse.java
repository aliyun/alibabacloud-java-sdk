// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsInstanceVersionResponseBody body;

    public static DescribeDrdsInstanceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceVersionResponse self = new DescribeDrdsInstanceVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstanceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsInstanceVersionResponse setBody(DescribeDrdsInstanceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstanceVersionResponseBody getBody() {
        return this.body;
    }

}
