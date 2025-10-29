// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateNoTrainPicAvatarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNoTrainPicAvatarResponseBody body;

    public static CreateNoTrainPicAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNoTrainPicAvatarResponse self = new CreateNoTrainPicAvatarResponse();
        return TeaModel.build(map, self);
    }

    public CreateNoTrainPicAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNoTrainPicAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNoTrainPicAvatarResponse setBody(CreateNoTrainPicAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNoTrainPicAvatarResponseBody getBody() {
        return this.body;
    }

}
