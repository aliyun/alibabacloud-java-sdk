// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneModelByTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneModelByTypeResponseBody body;

    public static DescribeSceneModelByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneModelByTypeResponse self = new DescribeSceneModelByTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneModelByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneModelByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneModelByTypeResponse setBody(DescribeSceneModelByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneModelByTypeResponseBody getBody() {
        return this.body;
    }

}
