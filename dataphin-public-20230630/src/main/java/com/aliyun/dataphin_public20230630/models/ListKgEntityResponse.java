// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListKgEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKgEntityResponseBody body;

    public static ListKgEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKgEntityResponse self = new ListKgEntityResponse();
        return TeaModel.build(map, self);
    }

    public ListKgEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKgEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKgEntityResponse setBody(ListKgEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKgEntityResponseBody getBody() {
        return this.body;
    }

}
