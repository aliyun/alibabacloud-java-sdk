// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UseAclBackupDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UseAclBackupDataResponseBody body;

    public static UseAclBackupDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UseAclBackupDataResponse self = new UseAclBackupDataResponse();
        return TeaModel.build(map, self);
    }

    public UseAclBackupDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UseAclBackupDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UseAclBackupDataResponse setBody(UseAclBackupDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UseAclBackupDataResponseBody getBody() {
        return this.body;
    }

}
