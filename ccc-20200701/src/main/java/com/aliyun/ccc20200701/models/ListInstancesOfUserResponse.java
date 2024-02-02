// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListInstancesOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancesOfUserResponseBody body;

    public static ListInstancesOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesOfUserResponse self = new ListInstancesOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancesOfUserResponse setBody(ListInstancesOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesOfUserResponseBody getBody() {
        return this.body;
    }

}
