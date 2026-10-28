// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstanceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGadInstanceDetailResponseBody body;

    public static DescribeGadInstanceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstanceDetailResponse self = new DescribeGadInstanceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstanceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGadInstanceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGadInstanceDetailResponse setBody(DescribeGadInstanceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGadInstanceDetailResponseBody getBody() {
        return this.body;
    }

}
