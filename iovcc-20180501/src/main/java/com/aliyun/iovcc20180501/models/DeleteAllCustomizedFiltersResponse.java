// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteAllCustomizedFiltersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAllCustomizedFiltersResponseBody body;

    public static DeleteAllCustomizedFiltersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllCustomizedFiltersResponse self = new DeleteAllCustomizedFiltersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAllCustomizedFiltersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAllCustomizedFiltersResponse setBody(DeleteAllCustomizedFiltersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAllCustomizedFiltersResponseBody getBody() {
        return this.body;
    }

}
