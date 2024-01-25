// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListExcessiveDeviceRegistrationApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExcessiveDeviceRegistrationApplicationsResponseBody body;

    public static ListExcessiveDeviceRegistrationApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExcessiveDeviceRegistrationApplicationsResponse self = new ListExcessiveDeviceRegistrationApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListExcessiveDeviceRegistrationApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExcessiveDeviceRegistrationApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExcessiveDeviceRegistrationApplicationsResponse setBody(ListExcessiveDeviceRegistrationApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExcessiveDeviceRegistrationApplicationsResponseBody getBody() {
        return this.body;
    }

}
