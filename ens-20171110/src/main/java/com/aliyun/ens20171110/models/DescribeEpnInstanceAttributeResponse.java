// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEpnInstanceAttributeResponseBody body;

    public static DescribeEpnInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstanceAttributeResponse self = new DescribeEpnInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEpnInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEpnInstanceAttributeResponse setBody(DescribeEpnInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEpnInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
