// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCdnSubTaskResponseBody body;

    public static DeleteCdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnSubTaskResponse self = new DeleteCdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCdnSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCdnSubTaskResponse setBody(DeleteCdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
