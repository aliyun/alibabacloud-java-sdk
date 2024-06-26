// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class BindFabricManagementChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindFabricManagementChaincodeResponseBody body;

    public static BindFabricManagementChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        BindFabricManagementChaincodeResponse self = new BindFabricManagementChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public BindFabricManagementChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindFabricManagementChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindFabricManagementChaincodeResponse setBody(BindFabricManagementChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public BindFabricManagementChaincodeResponseBody getBody() {
        return this.body;
    }

}
