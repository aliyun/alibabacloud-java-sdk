// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserDevicesResponseBody body;

    public static ListUserDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDevicesResponse self = new ListUserDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserDevicesResponse setBody(ListUserDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDevicesResponseBody getBody() {
        return this.body;
    }

}
