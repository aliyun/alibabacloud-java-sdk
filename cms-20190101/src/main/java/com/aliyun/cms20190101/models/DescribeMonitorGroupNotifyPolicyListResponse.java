// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupNotifyPolicyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMonitorGroupNotifyPolicyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorGroupNotifyPolicyListResponse setBody(DescribeMonitorGroupNotifyPolicyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupNotifyPolicyListResponseBody getBody() {
        return this.body;
    }

}
