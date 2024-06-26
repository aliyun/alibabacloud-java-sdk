// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumConfigResponseBody body;

    public static DescribeConsortiumConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumConfigResponse self = new DescribeConsortiumConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumConfigResponse setBody(DescribeConsortiumConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumConfigResponseBody getBody() {
        return this.body;
    }

}
