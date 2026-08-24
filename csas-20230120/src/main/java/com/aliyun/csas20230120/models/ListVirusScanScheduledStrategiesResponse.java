// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanScheduledStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusScanScheduledStrategiesResponseBody body;

    public static ListVirusScanScheduledStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanScheduledStrategiesResponse self = new ListVirusScanScheduledStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusScanScheduledStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusScanScheduledStrategiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusScanScheduledStrategiesResponse setBody(ListVirusScanScheduledStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusScanScheduledStrategiesResponseBody getBody() {
        return this.body;
    }

}
