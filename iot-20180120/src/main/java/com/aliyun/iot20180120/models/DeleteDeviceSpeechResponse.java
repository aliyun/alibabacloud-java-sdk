// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceSpeechResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteDeviceSpeechResponse setBody(DeleteDeviceSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceSpeechResponseBody getBody() {
        return this.body;
    }

}
