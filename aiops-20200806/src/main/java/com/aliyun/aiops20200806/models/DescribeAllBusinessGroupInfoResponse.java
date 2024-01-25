// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllBusinessGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllBusinessGroupInfoResponseBody body;

    public static DescribeAllBusinessGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllBusinessGroupInfoResponse self = new DescribeAllBusinessGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllBusinessGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllBusinessGroupInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllBusinessGroupInfoResponse setBody(DescribeAllBusinessGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllBusinessGroupInfoResponseBody getBody() {
        return this.body;
    }

}
