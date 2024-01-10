// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteUserDefineTableDataByPrimaryKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserDefineTableDataByPrimaryKeyResponseBody body;

    public static DeleteUserDefineTableDataByPrimaryKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineTableDataByPrimaryKeyResponse self = new DeleteUserDefineTableDataByPrimaryKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineTableDataByPrimaryKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserDefineTableDataByPrimaryKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserDefineTableDataByPrimaryKeyResponse setBody(DeleteUserDefineTableDataByPrimaryKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserDefineTableDataByPrimaryKeyResponseBody getBody() {
        return this.body;
    }

}
