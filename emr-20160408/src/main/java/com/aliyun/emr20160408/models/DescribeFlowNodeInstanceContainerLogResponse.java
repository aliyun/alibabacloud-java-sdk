// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceContainerLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowNodeInstanceContainerLogResponseBody body;

    public static DescribeFlowNodeInstanceContainerLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceContainerLogResponse self = new DescribeFlowNodeInstanceContainerLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceContainerLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowNodeInstanceContainerLogResponse setBody(DescribeFlowNodeInstanceContainerLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowNodeInstanceContainerLogResponseBody getBody() {
        return this.body;
    }

}
