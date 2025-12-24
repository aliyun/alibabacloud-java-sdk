// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20251111.models;

import com.aliyun.tea.*;

public class DescribeTerminalSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTerminalSettingsResponseBody body;

    public static DescribeTerminalSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTerminalSettingsResponse self = new DescribeTerminalSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTerminalSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTerminalSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTerminalSettingsResponse setBody(DescribeTerminalSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTerminalSettingsResponseBody getBody() {
        return this.body;
    }

}
