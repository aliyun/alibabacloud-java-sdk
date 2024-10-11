// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneResponseBody body;

    public static DescribeSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneResponse self = new DescribeSceneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneResponse setBody(DescribeSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneResponseBody getBody() {
        return this.body;
    }

}
