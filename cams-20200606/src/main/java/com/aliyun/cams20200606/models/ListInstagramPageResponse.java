// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListInstagramPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstagramPageResponseBody body;

    public static ListInstagramPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstagramPageResponse self = new ListInstagramPageResponse();
        return TeaModel.build(map, self);
    }

    public ListInstagramPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstagramPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstagramPageResponse setBody(ListInstagramPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstagramPageResponseBody getBody() {
        return this.body;
    }

}
