// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteExpertiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteExpertiseResponseBody body;

    public static DeleteExpertiseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpertiseResponse self = new DeleteExpertiseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpertiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpertiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpertiseResponse setBody(DeleteExpertiseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpertiseResponseBody getBody() {
        return this.body;
    }

}
