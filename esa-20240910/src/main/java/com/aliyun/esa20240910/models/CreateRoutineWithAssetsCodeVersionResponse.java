// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineWithAssetsCodeVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoutineWithAssetsCodeVersionResponseBody body;

    public static CreateRoutineWithAssetsCodeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineWithAssetsCodeVersionResponse self = new CreateRoutineWithAssetsCodeVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoutineWithAssetsCodeVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoutineWithAssetsCodeVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoutineWithAssetsCodeVersionResponse setBody(CreateRoutineWithAssetsCodeVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoutineWithAssetsCodeVersionResponseBody getBody() {
        return this.body;
    }

}
