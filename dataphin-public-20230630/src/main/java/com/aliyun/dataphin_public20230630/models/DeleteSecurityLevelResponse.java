// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityLevelResponseBody body;

    public static DeleteSecurityLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityLevelResponse self = new DeleteSecurityLevelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityLevelResponse setBody(DeleteSecurityLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityLevelResponseBody getBody() {
        return this.body;
    }

}
