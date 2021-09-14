// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeHostInstanceMonitorInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHostInstanceMonitorInfoResponseBody body;

    public static DescribeHostInstanceMonitorInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostInstanceMonitorInfoResponse self = new DescribeHostInstanceMonitorInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostInstanceMonitorInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostInstanceMonitorInfoResponse setBody(DescribeHostInstanceMonitorInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostInstanceMonitorInfoResponseBody getBody() {
        return this.body;
    }

}
