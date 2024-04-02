// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuditSettingResponseBody body;

    public static DescribeAuditSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditSettingResponse self = new DescribeAuditSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuditSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuditSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuditSettingResponse setBody(DescribeAuditSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuditSettingResponseBody getBody() {
        return this.body;
    }

}
