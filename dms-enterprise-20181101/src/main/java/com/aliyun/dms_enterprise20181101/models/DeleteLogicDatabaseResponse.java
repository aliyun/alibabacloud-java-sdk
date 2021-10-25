// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLogicDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLogicDatabaseResponseBody body;

    public static DeleteLogicDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogicDatabaseResponse self = new DeleteLogicDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogicDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogicDatabaseResponse setBody(DeleteLogicDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogicDatabaseResponseBody getBody() {
        return this.body;
    }

}
