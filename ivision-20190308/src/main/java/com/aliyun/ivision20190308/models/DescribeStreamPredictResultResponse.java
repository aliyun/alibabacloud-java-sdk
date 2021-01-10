// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DescribeStreamPredictResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStreamPredictResultResponseBody body;

    public static DescribeStreamPredictResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamPredictResultResponse self = new DescribeStreamPredictResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamPredictResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamPredictResultResponse setBody(DescribeStreamPredictResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamPredictResultResponseBody getBody() {
        return this.body;
    }

}
