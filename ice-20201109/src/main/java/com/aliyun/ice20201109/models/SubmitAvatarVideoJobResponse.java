// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAvatarVideoJobResponseBody body;

    public static SubmitAvatarVideoJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarVideoJobResponse self = new SubmitAvatarVideoJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarVideoJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAvatarVideoJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAvatarVideoJobResponse setBody(SubmitAvatarVideoJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAvatarVideoJobResponseBody getBody() {
        return this.body;
    }

}
