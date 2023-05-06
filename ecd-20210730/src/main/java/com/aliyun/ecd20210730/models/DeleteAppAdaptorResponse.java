// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppAdaptorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppAdaptorResponseBody body;

    public static DeleteAppAdaptorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppAdaptorResponse self = new DeleteAppAdaptorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppAdaptorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppAdaptorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppAdaptorResponse setBody(DeleteAppAdaptorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppAdaptorResponseBody getBody() {
        return this.body;
    }

}
