// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishRoutineCodeVersionResponseBody body;

    public static PublishRoutineCodeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeVersionResponse self = new PublishRoutineCodeVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishRoutineCodeVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishRoutineCodeVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishRoutineCodeVersionResponse setBody(PublishRoutineCodeVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishRoutineCodeVersionResponseBody getBody() {
        return this.body;
    }

}
