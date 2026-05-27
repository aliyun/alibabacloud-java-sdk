// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeWuyingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWuyingServerResponseBody body;

    public static DescribeWuyingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWuyingServerResponse self = new DescribeWuyingServerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWuyingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWuyingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWuyingServerResponse setBody(DescribeWuyingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWuyingServerResponseBody getBody() {
        return this.body;
    }

}
