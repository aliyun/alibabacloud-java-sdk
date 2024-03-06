// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeApplicationAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationAccessPointResponseBody body;

    public static DescribeApplicationAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAccessPointResponse self = new DescribeApplicationAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationAccessPointResponse setBody(DescribeApplicationAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationAccessPointResponseBody getBody() {
        return this.body;
    }

}
