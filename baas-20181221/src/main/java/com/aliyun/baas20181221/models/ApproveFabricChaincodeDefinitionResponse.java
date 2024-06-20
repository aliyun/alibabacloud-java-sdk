// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ApproveFabricChaincodeDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApproveFabricChaincodeDefinitionResponseBody body;

    public static ApproveFabricChaincodeDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveFabricChaincodeDefinitionResponse self = new ApproveFabricChaincodeDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public ApproveFabricChaincodeDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveFabricChaincodeDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveFabricChaincodeDefinitionResponse setBody(ApproveFabricChaincodeDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveFabricChaincodeDefinitionResponseBody getBody() {
        return this.body;
    }

}
