// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbRdsNameListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsDbRdsNameListResponseBody body;

    public static DescribeDrdsDbRdsNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbRdsNameListResponse self = new DescribeDrdsDbRdsNameListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbRdsNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDbRdsNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsDbRdsNameListResponse setBody(DescribeDrdsDbRdsNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDbRdsNameListResponseBody getBody() {
        return this.body;
    }

}
