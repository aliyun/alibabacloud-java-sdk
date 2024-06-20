// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFabricConsortiumResponseBody body;

    public static CreateFabricConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricConsortiumResponse self = new CreateFabricConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public CreateFabricConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFabricConsortiumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFabricConsortiumResponse setBody(CreateFabricConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFabricConsortiumResponseBody getBody() {
        return this.body;
    }

}
