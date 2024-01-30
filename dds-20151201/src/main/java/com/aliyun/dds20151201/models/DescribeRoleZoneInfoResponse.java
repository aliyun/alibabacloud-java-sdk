// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRoleZoneInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRoleZoneInfoResponseBody body;

    public static DescribeRoleZoneInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleZoneInfoResponse self = new DescribeRoleZoneInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoleZoneInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoleZoneInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRoleZoneInfoResponse setBody(DescribeRoleZoneInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoleZoneInfoResponseBody getBody() {
        return this.body;
    }

}
