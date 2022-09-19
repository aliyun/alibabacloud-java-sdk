// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListServersResponseBody body;

    public static ListServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServersResponse self = new ListServersResponse();
        return TeaModel.build(map, self);
    }

    public ListServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServersResponse setBody(ListServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServersResponseBody getBody() {
        return this.body;
    }

}
