// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class ListRechargeBillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRechargeBillsResponseBody body;

    public static ListRechargeBillsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRechargeBillsResponse self = new ListRechargeBillsResponse();
        return TeaModel.build(map, self);
    }

    public ListRechargeBillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRechargeBillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRechargeBillsResponse setBody(ListRechargeBillsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRechargeBillsResponseBody getBody() {
        return this.body;
    }

}
