// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaLiveInputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediaLiveInputResponseBody body;

    public static DeleteMediaLiveInputResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaLiveInputResponse self = new DeleteMediaLiveInputResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaLiveInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaLiveInputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediaLiveInputResponse setBody(DeleteMediaLiveInputResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaLiveInputResponseBody getBody() {
        return this.body;
    }

}
