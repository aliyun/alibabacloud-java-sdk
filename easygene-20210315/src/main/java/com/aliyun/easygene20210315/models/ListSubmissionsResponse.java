// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListSubmissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubmissionsResponseBody body;

    public static ListSubmissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubmissionsResponse self = new ListSubmissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubmissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubmissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubmissionsResponse setBody(ListSubmissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubmissionsResponseBody getBody() {
        return this.body;
    }

}
