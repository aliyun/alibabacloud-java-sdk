// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAvatarTrainingJobResponseBody body;

    public static SubmitAvatarTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarTrainingJobResponse self = new SubmitAvatarTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAvatarTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAvatarTrainingJobResponse setBody(SubmitAvatarTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAvatarTrainingJobResponseBody getBody() {
        return this.body;
    }

}
