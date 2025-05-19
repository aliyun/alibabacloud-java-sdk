// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteMyGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMyGroupInstancesResponseBody body;

    public static DeleteMyGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMyGroupInstancesResponse self = new DeleteMyGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMyGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMyGroupInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMyGroupInstancesResponse setBody(DeleteMyGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMyGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
