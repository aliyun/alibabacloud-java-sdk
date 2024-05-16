// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAppCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppCodeResponseBody body;

    public static DeleteAppCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppCodeResponse self = new DeleteAppCodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppCodeResponse setBody(DeleteAppCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppCodeResponseBody getBody() {
        return this.body;
    }

}
