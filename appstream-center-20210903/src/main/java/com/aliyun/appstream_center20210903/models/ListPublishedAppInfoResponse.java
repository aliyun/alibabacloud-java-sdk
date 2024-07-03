// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListPublishedAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishedAppInfoResponseBody body;

    public static ListPublishedAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppInfoResponse self = new ListPublishedAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishedAppInfoResponse setBody(ListPublishedAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedAppInfoResponseBody getBody() {
        return this.body;
    }

}
