// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveInputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaLiveInputResponseBody body;

    public static UpdateMediaLiveInputResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveInputResponse self = new UpdateMediaLiveInputResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaLiveInputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaLiveInputResponse setBody(UpdateMediaLiveInputResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaLiveInputResponseBody getBody() {
        return this.body;
    }

}
