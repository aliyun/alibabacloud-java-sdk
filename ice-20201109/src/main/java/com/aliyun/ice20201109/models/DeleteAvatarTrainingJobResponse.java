// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteAvatarTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAvatarTrainingJobResponseBody body;

    public static DeleteAvatarTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAvatarTrainingJobResponse self = new DeleteAvatarTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAvatarTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAvatarTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAvatarTrainingJobResponse setBody(DeleteAvatarTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAvatarTrainingJobResponseBody getBody() {
        return this.body;
    }

}
