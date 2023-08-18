// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAvatarTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAvatarTrainingJobResponseBody body;

    public static UpdateAvatarTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAvatarTrainingJobResponse self = new UpdateAvatarTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAvatarTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAvatarTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAvatarTrainingJobResponse setBody(UpdateAvatarTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAvatarTrainingJobResponseBody getBody() {
        return this.body;
    }

}
