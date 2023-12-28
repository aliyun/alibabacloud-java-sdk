// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ConfirmAvatar2dTrainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmAvatar2dTrainResponseBody body;

    public static ConfirmAvatar2dTrainResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAvatar2dTrainResponse self = new ConfirmAvatar2dTrainResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAvatar2dTrainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAvatar2dTrainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmAvatar2dTrainResponse setBody(ConfirmAvatar2dTrainResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAvatar2dTrainResponseBody getBody() {
        return this.body;
    }

}
