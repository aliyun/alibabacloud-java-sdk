// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateIndividuationTextTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIndividuationTextTaskResponseBody body;

    public static CreateIndividuationTextTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIndividuationTextTaskResponse self = new CreateIndividuationTextTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateIndividuationTextTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIndividuationTextTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIndividuationTextTaskResponse setBody(CreateIndividuationTextTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIndividuationTextTaskResponseBody getBody() {
        return this.body;
    }

}
