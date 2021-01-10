// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeConnectorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConnectorAttributeResponseBody body;

    public static DescribeConnectorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectorAttributeResponse self = new DescribeConnectorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConnectorAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConnectorAttributeResponse setBody(DescribeConnectorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConnectorAttributeResponseBody getBody() {
        return this.body;
    }

}
