// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowInstanceResponseBody body;

    public static DescribeFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowInstanceResponse self = new DescribeFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowInstanceResponse setBody(DescribeFlowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowInstanceResponseBody getBody() {
        return this.body;
    }

}
