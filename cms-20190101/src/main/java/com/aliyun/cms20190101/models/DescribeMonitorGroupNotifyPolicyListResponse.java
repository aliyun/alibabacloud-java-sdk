// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupNotifyPolicyListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMonitorGroupNotifyPolicyListResponseBody body;

    public static DescribeMonitorGroupNotifyPolicyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupNotifyPolicyListResponse self = new DescribeMonitorGroupNotifyPolicyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupNotifyPolicyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorGroupNotifyPolicyListResponse setBody(DescribeMonitorGroupNotifyPolicyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupNotifyPolicyListResponseBody getBody() {
        return this.body;
    }

}
