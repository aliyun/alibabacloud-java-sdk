// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListSyslogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSyslogsResponseBody body;

    public static ListSyslogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSyslogsResponse self = new ListSyslogsResponse();
        return TeaModel.build(map, self);
    }

    public ListSyslogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSyslogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSyslogsResponse setBody(ListSyslogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSyslogsResponseBody getBody() {
        return this.body;
    }

}
