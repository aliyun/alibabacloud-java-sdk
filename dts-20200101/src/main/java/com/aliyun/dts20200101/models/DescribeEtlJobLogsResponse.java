// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeEtlJobLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEtlJobLogsResponseBody body;

    public static DescribeEtlJobLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEtlJobLogsResponse self = new DescribeEtlJobLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEtlJobLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEtlJobLogsResponse setBody(DescribeEtlJobLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEtlJobLogsResponseBody getBody() {
        return this.body;
    }

}
