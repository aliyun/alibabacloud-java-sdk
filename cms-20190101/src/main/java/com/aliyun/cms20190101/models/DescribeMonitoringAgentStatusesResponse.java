// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMonitoringAgentStatusesResponseBody body;

    public static DescribeMonitoringAgentStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentStatusesResponse self = new DescribeMonitoringAgentStatusesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitoringAgentStatusesResponse setBody(DescribeMonitoringAgentStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitoringAgentStatusesResponseBody getBody() {
        return this.body;
    }

}
