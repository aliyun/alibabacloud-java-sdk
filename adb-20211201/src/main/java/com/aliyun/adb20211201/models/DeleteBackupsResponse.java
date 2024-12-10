// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBackupsResponseBody body;

    public static DeleteBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupsResponse self = new DeleteBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupsResponse setBody(DeleteBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupsResponseBody getBody() {
        return this.body;
    }

}
