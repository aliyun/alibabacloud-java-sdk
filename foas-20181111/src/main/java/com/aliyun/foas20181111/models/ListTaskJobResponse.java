// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListTaskJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskJobResponseBody body;

    public static ListTaskJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskJobResponse self = new ListTaskJobResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskJobResponse setBody(ListTaskJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskJobResponseBody getBody() {
        return this.body;
    }

}
