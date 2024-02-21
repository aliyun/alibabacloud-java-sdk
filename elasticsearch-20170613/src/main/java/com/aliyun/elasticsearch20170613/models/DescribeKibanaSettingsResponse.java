// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeKibanaSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKibanaSettingsResponseBody body;

    public static DescribeKibanaSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKibanaSettingsResponse self = new DescribeKibanaSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKibanaSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKibanaSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKibanaSettingsResponse setBody(DescribeKibanaSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKibanaSettingsResponseBody getBody() {
        return this.body;
    }

}
