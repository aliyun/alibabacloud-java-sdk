// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DeleteFailedDrdsDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFailedDrdsDBResponseBody body;

    public static DeleteFailedDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFailedDrdsDBResponse self = new DeleteFailedDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFailedDrdsDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFailedDrdsDBResponse setBody(DeleteFailedDrdsDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFailedDrdsDBResponseBody getBody() {
        return this.body;
    }

}
