// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeMaintenanceActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMaintenanceActionResponseBody body;

    public static DescribeMaintenanceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaintenanceActionResponse self = new DescribeMaintenanceActionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMaintenanceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMaintenanceActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMaintenanceActionResponse setBody(DescribeMaintenanceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMaintenanceActionResponseBody getBody() {
        return this.body;
    }

}
