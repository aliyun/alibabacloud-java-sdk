// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteUserInRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserInRecycleBinResponseBody body;

    public static DeleteUserInRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserInRecycleBinResponse self = new DeleteUserInRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserInRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserInRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserInRecycleBinResponse setBody(DeleteUserInRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserInRecycleBinResponseBody getBody() {
        return this.body;
    }

}
