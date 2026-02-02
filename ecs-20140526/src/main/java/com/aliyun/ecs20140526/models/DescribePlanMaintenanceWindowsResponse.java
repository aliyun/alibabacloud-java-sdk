// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePlanMaintenanceWindowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlanMaintenanceWindowsResponseBody body;

    public static DescribePlanMaintenanceWindowsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlanMaintenanceWindowsResponse self = new DescribePlanMaintenanceWindowsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlanMaintenanceWindowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlanMaintenanceWindowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlanMaintenanceWindowsResponse setBody(DescribePlanMaintenanceWindowsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlanMaintenanceWindowsResponseBody getBody() {
        return this.body;
    }

}
