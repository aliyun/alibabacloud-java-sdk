// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAvatarTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAvatarTrainingJobResponseBody body;

    public static GetAvatarTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvatarTrainingJobResponse self = new GetAvatarTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public GetAvatarTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvatarTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAvatarTrainingJobResponse setBody(GetAvatarTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvatarTrainingJobResponseBody getBody() {
        return this.body;
    }

}
