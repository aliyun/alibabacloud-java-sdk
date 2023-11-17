// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class ListBindingDeviceByAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBindingDeviceByAccountResponseBody body;

    public static ListBindingDeviceByAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBindingDeviceByAccountResponse self = new ListBindingDeviceByAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListBindingDeviceByAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBindingDeviceByAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBindingDeviceByAccountResponse setBody(ListBindingDeviceByAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBindingDeviceByAccountResponseBody getBody() {
        return this.body;
    }

}
