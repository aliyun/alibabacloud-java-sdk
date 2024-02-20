// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateTextDeformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTextDeformationResponseBody body;

    public static GenerateTextDeformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTextDeformationResponse self = new GenerateTextDeformationResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTextDeformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTextDeformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTextDeformationResponse setBody(GenerateTextDeformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTextDeformationResponseBody getBody() {
        return this.body;
    }

}
