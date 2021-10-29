// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DeleteDrdsDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDrdsDBResponseBody body;

    public static DeleteDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDrdsDBResponse self = new DeleteDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDrdsDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDrdsDBResponse setBody(DeleteDrdsDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDrdsDBResponseBody getBody() {
        return this.body;
    }

}
