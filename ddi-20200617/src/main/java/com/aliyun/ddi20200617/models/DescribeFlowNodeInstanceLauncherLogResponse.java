// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceLauncherLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowNodeInstanceLauncherLogResponseBody body;

    public static DescribeFlowNodeInstanceLauncherLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceLauncherLogResponse self = new DescribeFlowNodeInstanceLauncherLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceLauncherLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowNodeInstanceLauncherLogResponse setBody(DescribeFlowNodeInstanceLauncherLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowNodeInstanceLauncherLogResponseBody getBody() {
        return this.body;
    }

}
