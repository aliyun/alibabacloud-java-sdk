// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefenseObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneDefenseObjectsResponseBody body;

    public static DescribeSceneDefenseObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDefenseObjectsResponse self = new DescribeSceneDefenseObjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDefenseObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneDefenseObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneDefenseObjectsResponse setBody(DescribeSceneDefenseObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneDefenseObjectsResponseBody getBody() {
        return this.body;
    }

}
