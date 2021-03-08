// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DeleteHiTSDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHiTSDBInstanceResponseBody body;

    public static DeleteHiTSDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHiTSDBInstanceResponse self = new DeleteHiTSDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHiTSDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHiTSDBInstanceResponse setBody(DeleteHiTSDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHiTSDBInstanceResponseBody getBody() {
        return this.body;
    }

}
