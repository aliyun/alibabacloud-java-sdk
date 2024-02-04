// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSyndbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteSyndbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSyndbResponse setBody(DeleteSyndbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSyndbResponseBody getBody() {
        return this.body;
    }

}
