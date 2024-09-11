// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitDocClusterTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocClusterTaskResponseBody body;

    public static SubmitDocClusterTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocClusterTaskResponse self = new SubmitDocClusterTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocClusterTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocClusterTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocClusterTaskResponse setBody(SubmitDocClusterTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocClusterTaskResponseBody getBody() {
        return this.body;
    }

}
