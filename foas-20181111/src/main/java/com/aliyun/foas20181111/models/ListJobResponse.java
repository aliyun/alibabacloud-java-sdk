// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobResponseBody body;

    public static ListJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobResponse self = new ListJobResponse();
        return TeaModel.build(map, self);
    }

    public ListJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobResponse setBody(ListJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobResponseBody getBody() {
        return this.body;
    }

}
