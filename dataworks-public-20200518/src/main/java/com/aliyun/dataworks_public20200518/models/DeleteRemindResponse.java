// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteRemindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRemindResponseBody body;

    public static DeleteRemindResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemindResponse self = new DeleteRemindResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRemindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRemindResponse setBody(DeleteRemindResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRemindResponseBody getBody() {
        return this.body;
    }

}
