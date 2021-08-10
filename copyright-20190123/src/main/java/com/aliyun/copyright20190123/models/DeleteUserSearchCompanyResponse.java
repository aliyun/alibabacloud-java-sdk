// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeleteUserSearchCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserSearchCompanyResponseBody body;

    public static DeleteUserSearchCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserSearchCompanyResponse self = new DeleteUserSearchCompanyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserSearchCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserSearchCompanyResponse setBody(DeleteUserSearchCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserSearchCompanyResponseBody getBody() {
        return this.body;
    }

}
