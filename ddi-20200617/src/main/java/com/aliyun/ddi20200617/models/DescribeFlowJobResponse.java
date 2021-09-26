// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowJobResponseBody body;

    public static DescribeFlowJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowJobResponse self = new DescribeFlowJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowJobResponse setBody(DescribeFlowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowJobResponseBody getBody() {
        return this.body;
    }

}
