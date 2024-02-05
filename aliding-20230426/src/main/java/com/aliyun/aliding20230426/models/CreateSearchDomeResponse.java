// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSearchDomeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSearchDomeResponseBody body;

    public static CreateSearchDomeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchDomeResponse self = new CreateSearchDomeResponse();
        return TeaModel.build(map, self);
    }

    public CreateSearchDomeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSearchDomeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSearchDomeResponse setBody(CreateSearchDomeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSearchDomeResponseBody getBody() {
        return this.body;
    }

}
