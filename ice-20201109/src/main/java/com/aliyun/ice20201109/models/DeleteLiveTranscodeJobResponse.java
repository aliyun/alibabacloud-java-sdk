// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveTranscodeJobResponseBody body;

    public static DeleteLiveTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveTranscodeJobResponse self = new DeleteLiveTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveTranscodeJobResponse setBody(DeleteLiveTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
