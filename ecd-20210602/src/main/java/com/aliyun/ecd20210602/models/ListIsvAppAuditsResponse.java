// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListIsvAppAuditsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIsvAppAuditsResponseBody body;

    public static ListIsvAppAuditsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIsvAppAuditsResponse self = new ListIsvAppAuditsResponse();
        return TeaModel.build(map, self);
    }

    public ListIsvAppAuditsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIsvAppAuditsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIsvAppAuditsResponse setBody(ListIsvAppAuditsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIsvAppAuditsResponseBody getBody() {
        return this.body;
    }

}
