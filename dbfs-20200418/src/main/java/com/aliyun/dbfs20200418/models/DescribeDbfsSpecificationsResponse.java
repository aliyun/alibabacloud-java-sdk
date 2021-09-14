// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DescribeDbfsSpecificationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDbfsSpecificationsResponse setBody(DescribeDbfsSpecificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbfsSpecificationsResponseBody getBody() {
        return this.body;
    }

}
