// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteProcessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProcessInstanceResponseBody body;

    public static DeleteProcessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProcessInstanceResponse self = new DeleteProcessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProcessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProcessInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProcessInstanceResponse setBody(DeleteProcessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProcessInstanceResponseBody getBody() {
        return this.body;
    }

}
