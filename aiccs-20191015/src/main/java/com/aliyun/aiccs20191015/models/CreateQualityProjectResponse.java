// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateQualityProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQualityProjectResponseBody body;

    public static CreateQualityProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityProjectResponse self = new CreateQualityProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateQualityProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQualityProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQualityProjectResponse setBody(CreateQualityProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQualityProjectResponseBody getBody() {
        return this.body;
    }

}
