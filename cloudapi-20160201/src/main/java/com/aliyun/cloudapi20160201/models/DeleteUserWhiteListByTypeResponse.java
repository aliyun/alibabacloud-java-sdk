// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteUserWhiteListByTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserWhiteListByTypeResponseBody body;

    public static DeleteUserWhiteListByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserWhiteListByTypeResponse self = new DeleteUserWhiteListByTypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserWhiteListByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserWhiteListByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserWhiteListByTypeResponse setBody(DeleteUserWhiteListByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserWhiteListByTypeResponseBody getBody() {
        return this.body;
    }

}
