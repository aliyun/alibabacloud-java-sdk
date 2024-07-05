// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateFpShotDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFpShotDBResponseBody body;

    public static CreateFpShotDBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFpShotDBResponse self = new CreateFpShotDBResponse();
        return TeaModel.build(map, self);
    }

    public CreateFpShotDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFpShotDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFpShotDBResponse setBody(CreateFpShotDBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFpShotDBResponseBody getBody() {
        return this.body;
    }

}
