// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddDeviceBelongIdentifiersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDeviceBelongIdentifiersResponseBody body;

    public static AddDeviceBelongIdentifiersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceBelongIdentifiersResponse self = new AddDeviceBelongIdentifiersResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceBelongIdentifiersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceBelongIdentifiersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDeviceBelongIdentifiersResponse setBody(AddDeviceBelongIdentifiersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceBelongIdentifiersResponseBody getBody() {
        return this.body;
    }

}
