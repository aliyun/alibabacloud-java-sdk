// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaToSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMediaToSearchLibResponseBody body;

    public static UpdateMediaToSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaToSearchLibResponse self = new UpdateMediaToSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaToSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaToSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaToSearchLibResponse setBody(UpdateMediaToSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaToSearchLibResponseBody getBody() {
        return this.body;
    }

}
