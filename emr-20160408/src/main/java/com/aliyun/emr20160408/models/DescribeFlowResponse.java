// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowResponseBody body;

    public static DescribeFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowResponse self = new DescribeFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowResponse setBody(DescribeFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowResponseBody getBody() {
        return this.body;
    }

}
