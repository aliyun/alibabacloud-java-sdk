// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListInstallableGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstallableGatewaysResponseBody body;

    public static ListInstallableGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstallableGatewaysResponse self = new ListInstallableGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public ListInstallableGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstallableGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstallableGatewaysResponse setBody(ListInstallableGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstallableGatewaysResponseBody getBody() {
        return this.body;
    }

}
