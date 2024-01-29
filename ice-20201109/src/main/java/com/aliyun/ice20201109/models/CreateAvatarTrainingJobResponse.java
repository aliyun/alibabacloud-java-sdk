// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAvatarTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAvatarTrainingJobResponseBody body;

    public static CreateAvatarTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAvatarTrainingJobResponse self = new CreateAvatarTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateAvatarTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAvatarTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAvatarTrainingJobResponse setBody(CreateAvatarTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAvatarTrainingJobResponseBody getBody() {
        return this.body;
    }

}
