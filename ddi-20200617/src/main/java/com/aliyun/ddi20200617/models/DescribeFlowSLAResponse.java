// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowSLAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowSLAResponseBody body;

    public static DescribeFlowSLAResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowSLAResponse self = new DescribeFlowSLAResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowSLAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowSLAResponse setBody(DescribeFlowSLAResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowSLAResponseBody getBody() {
        return this.body;
    }

}
