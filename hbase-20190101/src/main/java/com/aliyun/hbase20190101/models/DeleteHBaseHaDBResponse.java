// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHBaseHaDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHBaseHaDBResponseBody body;

    public static DeleteHBaseHaDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHBaseHaDBResponse self = new DeleteHBaseHaDBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHBaseHaDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHBaseHaDBResponse setBody(DeleteHBaseHaDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHBaseHaDBResponseBody getBody() {
        return this.body;
    }

}
