// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSoftwareForUserDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSoftwareForUserDeviceResponseBody body;

    public static ListSoftwareForUserDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwareForUserDeviceResponse self = new ListSoftwareForUserDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListSoftwareForUserDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSoftwareForUserDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSoftwareForUserDeviceResponse setBody(ListSoftwareForUserDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSoftwareForUserDeviceResponseBody getBody() {
        return this.body;
    }

}
