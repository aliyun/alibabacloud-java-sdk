// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFacesSearchingTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFacesSearchingTaskResponseBody body;

    public static CreateFacesSearchingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFacesSearchingTaskResponse self = new CreateFacesSearchingTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateFacesSearchingTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFacesSearchingTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFacesSearchingTaskResponse setBody(CreateFacesSearchingTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFacesSearchingTaskResponseBody getBody() {
        return this.body;
    }

}
