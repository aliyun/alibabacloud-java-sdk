// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowCategoryTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowCategoryTreeResponseBody body;

    public static DescribeFlowCategoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowCategoryTreeResponse self = new DescribeFlowCategoryTreeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowCategoryTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowCategoryTreeResponse setBody(DescribeFlowCategoryTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowCategoryTreeResponseBody getBody() {
        return this.body;
    }

}
