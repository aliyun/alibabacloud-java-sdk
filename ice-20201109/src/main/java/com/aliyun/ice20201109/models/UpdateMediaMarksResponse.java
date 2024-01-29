// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaMarksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaMarksResponseBody body;

    public static UpdateMediaMarksResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaMarksResponse self = new UpdateMediaMarksResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaMarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaMarksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaMarksResponse setBody(UpdateMediaMarksResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaMarksResponseBody getBody() {
        return this.body;
    }

}
