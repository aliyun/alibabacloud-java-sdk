// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class ListResourcesByTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourcesByTagResponseBody body;

    public static ListResourcesByTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByTagResponse self = new ListResourcesByTagResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcesByTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcesByTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourcesByTagResponse setBody(ListResourcesByTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcesByTagResponseBody getBody() {
        return this.body;
    }

}
