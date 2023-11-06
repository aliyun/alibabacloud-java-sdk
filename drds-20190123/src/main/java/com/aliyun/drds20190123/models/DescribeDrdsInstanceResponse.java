// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsInstanceResponseBody body;

    public static DescribeDrdsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceResponse self = new DescribeDrdsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsInstanceResponse setBody(DescribeDrdsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstanceResponseBody getBody() {
        return this.body;
    }

}
