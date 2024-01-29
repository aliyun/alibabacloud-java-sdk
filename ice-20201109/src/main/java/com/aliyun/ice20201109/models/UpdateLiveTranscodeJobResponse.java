// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveTranscodeJobResponseBody body;

    public static UpdateLiveTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTranscodeJobResponse self = new UpdateLiveTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveTranscodeJobResponse setBody(UpdateLiveTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
