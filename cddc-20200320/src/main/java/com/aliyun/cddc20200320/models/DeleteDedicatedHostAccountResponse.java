// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDedicatedHostAccountResponseBody body;

    public static DeleteDedicatedHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostAccountResponse self = new DeleteDedicatedHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDedicatedHostAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDedicatedHostAccountResponse setBody(DeleteDedicatedHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDedicatedHostAccountResponseBody getBody() {
        return this.body;
    }

}
