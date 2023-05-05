// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListDistributeAllUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDistributeAllUserResponseBody body;

    public static ListDistributeAllUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributeAllUserResponse self = new ListDistributeAllUserResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributeAllUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributeAllUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributeAllUserResponse setBody(ListDistributeAllUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributeAllUserResponseBody getBody() {
        return this.body;
    }

}
