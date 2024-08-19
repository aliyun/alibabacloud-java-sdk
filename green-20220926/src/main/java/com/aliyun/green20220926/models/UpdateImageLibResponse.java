// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateImageLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateImageLibResponseBody body;

    public static UpdateImageLibResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageLibResponse self = new UpdateImageLibResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageLibResponse setBody(UpdateImageLibResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageLibResponseBody getBody() {
        return this.body;
    }

}
