// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexAccFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlexAccFlowResponseBody body;

    public static DescribeFlexAccFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexAccFlowResponse self = new DescribeFlexAccFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlexAccFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlexAccFlowResponse setBody(DescribeFlexAccFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlexAccFlowResponseBody getBody() {
        return this.body;
    }

}
