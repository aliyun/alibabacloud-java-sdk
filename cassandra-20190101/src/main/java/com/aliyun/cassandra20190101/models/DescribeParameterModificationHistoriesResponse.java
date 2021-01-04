// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeParameterModificationHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeParameterModificationHistoriesResponseBody body;

    public static DescribeParameterModificationHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterModificationHistoriesResponse self = new DescribeParameterModificationHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterModificationHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterModificationHistoriesResponse setBody(DescribeParameterModificationHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterModificationHistoriesResponseBody getBody() {
        return this.body;
    }

}
