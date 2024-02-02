// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSoundCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSoundCodeResponseBody body;

    public static DeleteSoundCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSoundCodeResponse self = new DeleteSoundCodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSoundCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSoundCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSoundCodeResponse setBody(DeleteSoundCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSoundCodeResponseBody getBody() {
        return this.body;
    }

}
