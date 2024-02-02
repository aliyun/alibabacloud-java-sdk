// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAUnfinishedTaskByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOTAUnfinishedTaskByDeviceResponseBody body;

    public static ListOTAUnfinishedTaskByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAUnfinishedTaskByDeviceResponse self = new ListOTAUnfinishedTaskByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAUnfinishedTaskByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOTAUnfinishedTaskByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOTAUnfinishedTaskByDeviceResponse setBody(ListOTAUnfinishedTaskByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOTAUnfinishedTaskByDeviceResponseBody getBody() {
        return this.body;
    }

}
