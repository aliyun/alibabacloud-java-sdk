// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeConnectorCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConnectorCapabilityResponseBody body;

    public static DescribeConnectorCapabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectorCapabilityResponse self = new DescribeConnectorCapabilityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConnectorCapabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConnectorCapabilityResponse setBody(DescribeConnectorCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConnectorCapabilityResponseBody getBody() {
        return this.body;
    }

}
