// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImagePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImagePriceResponseBody body;

    public static DescribeImagePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePriceResponse self = new DescribeImagePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImagePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImagePriceResponse setBody(DescribeImagePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImagePriceResponseBody getBody() {
        return this.body;
    }

}
