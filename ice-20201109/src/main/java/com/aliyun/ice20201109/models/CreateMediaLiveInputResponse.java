// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveInputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMediaLiveInputResponseBody body;

    public static CreateMediaLiveInputResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveInputResponse self = new CreateMediaLiveInputResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaLiveInputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMediaLiveInputResponse setBody(CreateMediaLiveInputResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaLiveInputResponseBody getBody() {
        return this.body;
    }

}
