// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DbfsRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DbfsRecordResponseBody body;

    public static DbfsRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DbfsRecordResponse self = new DbfsRecordResponse();
        return TeaModel.build(map, self);
    }

    public DbfsRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DbfsRecordResponse setBody(DbfsRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DbfsRecordResponseBody getBody() {
        return this.body;
    }

}
