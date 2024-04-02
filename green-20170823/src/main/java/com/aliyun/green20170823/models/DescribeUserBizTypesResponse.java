// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUserBizTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserBizTypesResponseBody body;

    public static DescribeUserBizTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBizTypesResponse self = new DescribeUserBizTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserBizTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserBizTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserBizTypesResponse setBody(DescribeUserBizTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserBizTypesResponseBody getBody() {
        return this.body;
    }

}
