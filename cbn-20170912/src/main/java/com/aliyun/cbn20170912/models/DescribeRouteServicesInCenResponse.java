// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteServicesInCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRouteServicesInCenResponseBody body;

    public static DescribeRouteServicesInCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteServicesInCenResponse self = new DescribeRouteServicesInCenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteServicesInCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouteServicesInCenResponse setBody(DescribeRouteServicesInCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouteServicesInCenResponseBody getBody() {
        return this.body;
    }

}
