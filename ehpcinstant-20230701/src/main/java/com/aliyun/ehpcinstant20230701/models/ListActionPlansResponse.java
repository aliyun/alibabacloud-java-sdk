// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListActionPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListActionPlansResponseBody body;

    public static ListActionPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActionPlansResponse self = new ListActionPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListActionPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActionPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActionPlansResponse setBody(ListActionPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActionPlansResponseBody getBody() {
        return this.body;
    }

}
