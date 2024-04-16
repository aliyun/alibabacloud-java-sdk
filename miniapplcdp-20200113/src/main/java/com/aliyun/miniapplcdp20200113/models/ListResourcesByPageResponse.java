// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListResourcesByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourcesByPageResponseBody body;

    public static ListResourcesByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByPageResponse self = new ListResourcesByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcesByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcesByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourcesByPageResponse setBody(ListResourcesByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcesByPageResponseBody getBody() {
        return this.body;
    }

}
