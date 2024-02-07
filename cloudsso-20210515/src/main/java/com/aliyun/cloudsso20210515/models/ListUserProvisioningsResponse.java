// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUserProvisioningsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserProvisioningsResponseBody body;

    public static ListUserProvisioningsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserProvisioningsResponse self = new ListUserProvisioningsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserProvisioningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserProvisioningsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserProvisioningsResponse setBody(ListUserProvisioningsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserProvisioningsResponseBody getBody() {
        return this.body;
    }

}
