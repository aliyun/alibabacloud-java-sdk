// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstanceDbMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGadInstanceDbMembersResponseBody body;

    public static DescribeGadInstanceDbMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstanceDbMembersResponse self = new DescribeGadInstanceDbMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstanceDbMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGadInstanceDbMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGadInstanceDbMembersResponse setBody(DescribeGadInstanceDbMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGadInstanceDbMembersResponseBody getBody() {
        return this.body;
    }

}
