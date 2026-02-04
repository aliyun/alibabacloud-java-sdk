// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCustomFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomFieldResponseBody body;

    public static DeleteCustomFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomFieldResponse self = new DeleteCustomFieldResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomFieldResponse setBody(DeleteCustomFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomFieldResponseBody getBody() {
        return this.body;
    }

}
