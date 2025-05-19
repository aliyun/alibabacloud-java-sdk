// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class AddMyGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMyGroupInstancesResponseBody body;

    public static AddMyGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMyGroupInstancesResponse self = new AddMyGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AddMyGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMyGroupInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMyGroupInstancesResponse setBody(AddMyGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMyGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
