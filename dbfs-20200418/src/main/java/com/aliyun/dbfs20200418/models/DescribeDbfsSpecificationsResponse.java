// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DescribeDbfsSpecificationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDbfsSpecificationsResponseBody body;

    public static DescribeDbfsSpecificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbfsSpecificationsResponse self = new DescribeDbfsSpecificationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbfsSpecificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbfsSpecificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbfsSpecificationsResponse setBody(DescribeDbfsSpecificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbfsSpecificationsResponseBody getBody() {
        return this.body;
    }

}
