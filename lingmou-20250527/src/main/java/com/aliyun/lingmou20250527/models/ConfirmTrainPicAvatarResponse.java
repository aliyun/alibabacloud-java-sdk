// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ConfirmTrainPicAvatarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmTrainPicAvatarResponseBody body;

    public static ConfirmTrainPicAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmTrainPicAvatarResponse self = new ConfirmTrainPicAvatarResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmTrainPicAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmTrainPicAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmTrainPicAvatarResponse setBody(ConfirmTrainPicAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmTrainPicAvatarResponseBody getBody() {
        return this.body;
    }

}
