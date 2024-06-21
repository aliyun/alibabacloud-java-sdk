// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRumUploadFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRumUploadFileResponseBody body;

    public static DeleteRumUploadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRumUploadFileResponse self = new DeleteRumUploadFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRumUploadFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRumUploadFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRumUploadFileResponse setBody(DeleteRumUploadFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRumUploadFileResponseBody getBody() {
        return this.body;
    }

}
