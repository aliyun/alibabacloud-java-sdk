// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupSchedulingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceGroupSchedulingResponseBody body;

    public static DeleteServiceGroupSchedulingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupSchedulingResponse self = new DeleteServiceGroupSchedulingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupSchedulingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceGroupSchedulingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceGroupSchedulingResponse setBody(DeleteServiceGroupSchedulingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceGroupSchedulingResponseBody getBody() {
        return this.body;
    }

}
