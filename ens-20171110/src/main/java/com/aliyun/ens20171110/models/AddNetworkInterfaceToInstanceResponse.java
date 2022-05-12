// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddNetworkInterfaceToInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddNetworkInterfaceToInstanceResponseBody body;

    public static AddNetworkInterfaceToInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddNetworkInterfaceToInstanceResponse self = new AddNetworkInterfaceToInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddNetworkInterfaceToInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddNetworkInterfaceToInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddNetworkInterfaceToInstanceResponse setBody(AddNetworkInterfaceToInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddNetworkInterfaceToInstanceResponseBody getBody() {
        return this.body;
    }

}
