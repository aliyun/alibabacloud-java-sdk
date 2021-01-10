// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeFlowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowTemplateResponseBody body;

    public static DescribeFlowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTemplateResponse self = new DescribeFlowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowTemplateResponse setBody(DescribeFlowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowTemplateResponseBody getBody() {
        return this.body;
    }

}
