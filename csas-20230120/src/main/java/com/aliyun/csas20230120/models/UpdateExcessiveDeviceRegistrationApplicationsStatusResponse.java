// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateExcessiveDeviceRegistrationApplicationsStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody body;

    public static UpdateExcessiveDeviceRegistrationApplicationsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExcessiveDeviceRegistrationApplicationsStatusResponse self = new UpdateExcessiveDeviceRegistrationApplicationsStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponse setBody(UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody getBody() {
        return this.body;
    }

}
