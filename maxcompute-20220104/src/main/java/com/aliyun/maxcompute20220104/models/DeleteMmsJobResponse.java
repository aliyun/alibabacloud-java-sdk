// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteMmsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMmsJobResponseBody body;

    public static DeleteMmsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMmsJobResponse self = new DeleteMmsJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMmsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMmsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMmsJobResponse setBody(DeleteMmsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMmsJobResponseBody getBody() {
        return this.body;
    }

}
