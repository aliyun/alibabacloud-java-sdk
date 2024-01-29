// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteCustomizedVoiceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomizedVoiceJobResponseBody body;

    public static DeleteCustomizedVoiceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedVoiceJobResponse self = new DeleteCustomizedVoiceJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedVoiceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizedVoiceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomizedVoiceJobResponse setBody(DeleteCustomizedVoiceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizedVoiceJobResponseBody getBody() {
        return this.body;
    }

}
