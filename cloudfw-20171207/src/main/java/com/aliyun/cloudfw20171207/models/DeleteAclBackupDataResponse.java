// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteAclBackupDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAclBackupDataResponseBody body;

    public static DeleteAclBackupDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclBackupDataResponse self = new DeleteAclBackupDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAclBackupDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAclBackupDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAclBackupDataResponse setBody(DeleteAclBackupDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAclBackupDataResponseBody getBody() {
        return this.body;
    }

}
