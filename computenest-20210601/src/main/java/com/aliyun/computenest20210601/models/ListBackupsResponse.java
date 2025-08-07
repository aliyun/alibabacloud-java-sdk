// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBackupsResponseBody body;

    public static ListBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBackupsResponse self = new ListBackupsResponse();
        return TeaModel.build(map, self);
    }

    public ListBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBackupsResponse setBody(ListBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBackupsResponseBody getBody() {
        return this.body;
    }

}
