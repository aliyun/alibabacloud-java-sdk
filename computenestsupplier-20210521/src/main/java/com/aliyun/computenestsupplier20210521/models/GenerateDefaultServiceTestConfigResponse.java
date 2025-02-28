// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GenerateDefaultServiceTestConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateDefaultServiceTestConfigResponseBody body;

    public static GenerateDefaultServiceTestConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDefaultServiceTestConfigResponse self = new GenerateDefaultServiceTestConfigResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDefaultServiceTestConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDefaultServiceTestConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDefaultServiceTestConfigResponse setBody(GenerateDefaultServiceTestConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDefaultServiceTestConfigResponseBody getBody() {
        return this.body;
    }

}
