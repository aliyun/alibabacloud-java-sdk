// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionSettingsResponseBody body;

    public static DescribeInspectionSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionSettingsResponse self = new DescribeInspectionSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionSettingsResponse setBody(DescribeInspectionSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionSettingsResponseBody getBody() {
        return this.body;
    }

}
