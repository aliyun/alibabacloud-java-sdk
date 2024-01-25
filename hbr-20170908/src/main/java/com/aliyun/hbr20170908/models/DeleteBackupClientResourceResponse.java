// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupClientResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBackupClientResourceResponseBody body;

    public static DeleteBackupClientResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupClientResourceResponse self = new DeleteBackupClientResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupClientResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupClientResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupClientResourceResponse setBody(DeleteBackupClientResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupClientResourceResponseBody getBody() {
        return this.body;
    }

}
