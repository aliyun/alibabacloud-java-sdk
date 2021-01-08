// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSceneResponse setBody(DescribeSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneResponseBody getBody() {
        return this.body;
    }

}
