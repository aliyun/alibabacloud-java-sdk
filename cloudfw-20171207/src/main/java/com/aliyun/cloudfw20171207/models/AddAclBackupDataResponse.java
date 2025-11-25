// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAclBackupDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAclBackupDataResponseBody body;

    public static AddAclBackupDataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAclBackupDataResponse self = new AddAclBackupDataResponse();
        return TeaModel.build(map, self);
    }

    public AddAclBackupDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAclBackupDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAclBackupDataResponse setBody(AddAclBackupDataResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAclBackupDataResponseBody getBody() {
        return this.body;
    }

}
