// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteDownloadTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDownloadTaskResponseBody body;

    public static DeleteDownloadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDownloadTaskResponse self = new DeleteDownloadTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDownloadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDownloadTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDownloadTaskResponse setBody(DeleteDownloadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDownloadTaskResponseBody getBody() {
        return this.body;
    }

}
