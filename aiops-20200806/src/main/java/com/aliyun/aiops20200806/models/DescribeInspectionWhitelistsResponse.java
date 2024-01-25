// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionWhitelistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionWhitelistsResponseBody body;

    public static DescribeInspectionWhitelistsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionWhitelistsResponse self = new DescribeInspectionWhitelistsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionWhitelistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionWhitelistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionWhitelistsResponse setBody(DescribeInspectionWhitelistsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionWhitelistsResponseBody getBody() {
        return this.body;
    }

}
