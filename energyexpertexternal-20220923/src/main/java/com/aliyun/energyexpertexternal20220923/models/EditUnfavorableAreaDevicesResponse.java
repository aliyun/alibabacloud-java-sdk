// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class EditUnfavorableAreaDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditUnfavorableAreaDevicesResponseBody body;

    public static EditUnfavorableAreaDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        EditUnfavorableAreaDevicesResponse self = new EditUnfavorableAreaDevicesResponse();
        return TeaModel.build(map, self);
    }

    public EditUnfavorableAreaDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditUnfavorableAreaDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditUnfavorableAreaDevicesResponse setBody(EditUnfavorableAreaDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public EditUnfavorableAreaDevicesResponseBody getBody() {
        return this.body;
    }

}
