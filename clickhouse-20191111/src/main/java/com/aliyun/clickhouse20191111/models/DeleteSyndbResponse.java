// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSyndbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSyndbResponseBody body;

    public static DeleteSyndbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSyndbResponse self = new DeleteSyndbResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSyndbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSyndbResponse setBody(DeleteSyndbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSyndbResponseBody getBody() {
        return this.body;
    }

}
