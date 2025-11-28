// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateTrainPicAvatarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrainPicAvatarResponseBody body;

    public static CreateTrainPicAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainPicAvatarResponse self = new CreateTrainPicAvatarResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrainPicAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrainPicAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrainPicAvatarResponse setBody(CreateTrainPicAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrainPicAvatarResponseBody getBody() {
        return this.body;
    }

}
