// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContainerGroupPriceResponseBody body;

    public static DescribeContainerGroupPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupPriceResponse self = new DescribeContainerGroupPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerGroupPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerGroupPriceResponse setBody(DescribeContainerGroupPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerGroupPriceResponseBody getBody() {
        return this.body;
    }

}
