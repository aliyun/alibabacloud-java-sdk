// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListUserInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserInstancesResponseBody body;

    public static ListUserInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserInstancesResponse self = new ListUserInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserInstancesResponse setBody(ListUserInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserInstancesResponseBody getBody() {
        return this.body;
    }

}
