// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeParameterModificationHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeParameterModificationHistoryResponseBody body;

    public static DescribeParameterModificationHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterModificationHistoryResponse self = new DescribeParameterModificationHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterModificationHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterModificationHistoryResponse setBody(DescribeParameterModificationHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterModificationHistoryResponseBody getBody() {
        return this.body;
    }

}
