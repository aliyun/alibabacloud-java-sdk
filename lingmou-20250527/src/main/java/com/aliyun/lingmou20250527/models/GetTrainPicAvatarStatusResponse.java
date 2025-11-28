// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetTrainPicAvatarStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrainPicAvatarStatusResponseBody body;

    public static GetTrainPicAvatarStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainPicAvatarStatusResponse self = new GetTrainPicAvatarStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainPicAvatarStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainPicAvatarStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrainPicAvatarStatusResponse setBody(GetTrainPicAvatarStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainPicAvatarStatusResponseBody getBody() {
        return this.body;
    }

}
