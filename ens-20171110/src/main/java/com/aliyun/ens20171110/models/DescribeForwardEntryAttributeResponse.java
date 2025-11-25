// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeForwardEntryAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeForwardEntryAttributeResponseBody body;

    public static DescribeForwardEntryAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardEntryAttributeResponse self = new DescribeForwardEntryAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeForwardEntryAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeForwardEntryAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeForwardEntryAttributeResponse setBody(DescribeForwardEntryAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeForwardEntryAttributeResponseBody getBody() {
        return this.body;
    }

}
