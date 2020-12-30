// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowCategoryResponseBody body;

    public static DescribeFlowCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowCategoryResponse self = new DescribeFlowCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowCategoryResponse setBody(DescribeFlowCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowCategoryResponseBody getBody() {
        return this.body;
    }

}
