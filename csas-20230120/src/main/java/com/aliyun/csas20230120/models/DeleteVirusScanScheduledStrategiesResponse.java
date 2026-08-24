// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteVirusScanScheduledStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVirusScanScheduledStrategiesResponseBody body;

    public static DeleteVirusScanScheduledStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirusScanScheduledStrategiesResponse self = new DeleteVirusScanScheduledStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirusScanScheduledStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirusScanScheduledStrategiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirusScanScheduledStrategiesResponse setBody(DeleteVirusScanScheduledStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirusScanScheduledStrategiesResponseBody getBody() {
        return this.body;
    }

}
