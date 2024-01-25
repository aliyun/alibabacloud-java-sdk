// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteAppForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppForInnerResponseBody body;

    public static DeleteAppForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppForInnerResponse self = new DeleteAppForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppForInnerResponse setBody(DeleteAppForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppForInnerResponseBody getBody() {
        return this.body;
    }

}
