// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteBindAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBindAccountResponseBody body;

    public static DeleteBindAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindAccountResponse self = new DeleteBindAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBindAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBindAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBindAccountResponse setBody(DeleteBindAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBindAccountResponseBody getBody() {
        return this.body;
    }

}
