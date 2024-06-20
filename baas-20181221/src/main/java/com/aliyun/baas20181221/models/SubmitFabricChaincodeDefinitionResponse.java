// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class SubmitFabricChaincodeDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitFabricChaincodeDefinitionResponseBody body;

    public static SubmitFabricChaincodeDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFabricChaincodeDefinitionResponse self = new SubmitFabricChaincodeDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFabricChaincodeDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFabricChaincodeDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitFabricChaincodeDefinitionResponse setBody(SubmitFabricChaincodeDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFabricChaincodeDefinitionResponseBody getBody() {
        return this.body;
    }

}
