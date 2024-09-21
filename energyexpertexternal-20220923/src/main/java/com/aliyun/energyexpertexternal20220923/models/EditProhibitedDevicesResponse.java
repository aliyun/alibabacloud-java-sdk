// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class EditProhibitedDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditProhibitedDevicesResponseBody body;

    public static EditProhibitedDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        EditProhibitedDevicesResponse self = new EditProhibitedDevicesResponse();
        return TeaModel.build(map, self);
    }

    public EditProhibitedDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditProhibitedDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditProhibitedDevicesResponse setBody(EditProhibitedDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public EditProhibitedDevicesResponseBody getBody() {
        return this.body;
    }

}
