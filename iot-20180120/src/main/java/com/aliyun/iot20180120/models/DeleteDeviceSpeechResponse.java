// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceSpeechResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeviceSpeechResponseBody body;

    public static DeleteDeviceSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceSpeechResponse self = new DeleteDeviceSpeechResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceSpeechResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceSpeechResponse setBody(DeleteDeviceSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceSpeechResponseBody getBody() {
        return this.body;
    }

}
