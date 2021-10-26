// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiStageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiStageResponseBody body;

    public static DescribeApiStageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiStageResponse self = new DescribeApiStageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiStageResponse setBody(DescribeApiStageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiStageResponseBody getBody() {
        return this.body;
    }

}
