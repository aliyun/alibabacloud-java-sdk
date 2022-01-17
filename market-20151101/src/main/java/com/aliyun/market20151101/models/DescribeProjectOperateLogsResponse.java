// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectOperateLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectOperateLogsResponseBody body;

    public static DescribeProjectOperateLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectOperateLogsResponse self = new DescribeProjectOperateLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectOperateLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectOperateLogsResponse setBody(DescribeProjectOperateLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectOperateLogsResponseBody getBody() {
        return this.body;
    }

}
