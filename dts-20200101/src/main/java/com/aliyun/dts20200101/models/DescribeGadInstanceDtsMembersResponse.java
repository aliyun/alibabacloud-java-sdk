// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstanceDtsMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGadInstanceDtsMembersResponseBody body;

    public static DescribeGadInstanceDtsMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstanceDtsMembersResponse self = new DescribeGadInstanceDtsMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstanceDtsMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGadInstanceDtsMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGadInstanceDtsMembersResponse setBody(DescribeGadInstanceDtsMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGadInstanceDtsMembersResponseBody getBody() {
        return this.body;
    }

}
