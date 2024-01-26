// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSyntheticTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSyntheticTaskResponseBody body;

    public static DeleteSyntheticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSyntheticTaskResponse self = new DeleteSyntheticTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSyntheticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSyntheticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSyntheticTaskResponse setBody(DeleteSyntheticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSyntheticTaskResponseBody getBody() {
        return this.body;
    }

}
