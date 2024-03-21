// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishRoutineCodeRevisionResponseBody body;

    public static PublishRoutineCodeRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeRevisionResponse self = new PublishRoutineCodeRevisionResponse();
        return TeaModel.build(map, self);
    }

    public PublishRoutineCodeRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishRoutineCodeRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishRoutineCodeRevisionResponse setBody(PublishRoutineCodeRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishRoutineCodeRevisionResponseBody getBody() {
        return this.body;
    }

}
