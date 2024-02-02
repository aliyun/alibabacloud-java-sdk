// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteAudioFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAudioFileResponseBody body;

    public static DeleteAudioFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAudioFileResponse self = new DeleteAudioFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAudioFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAudioFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAudioFileResponse setBody(DeleteAudioFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAudioFileResponseBody getBody() {
        return this.body;
    }

}
