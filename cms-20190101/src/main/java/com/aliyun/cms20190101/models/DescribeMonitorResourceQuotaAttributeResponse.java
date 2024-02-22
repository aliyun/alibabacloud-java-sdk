// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorResourceQuotaAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitorResourceQuotaAttributeResponseBody body;

    public static DescribeMonitorResourceQuotaAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorResourceQuotaAttributeResponse self = new DescribeMonitorResourceQuotaAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorResourceQuotaAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorResourceQuotaAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorResourceQuotaAttributeResponse setBody(DescribeMonitorResourceQuotaAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorResourceQuotaAttributeResponseBody getBody() {
        return this.body;
    }

}
