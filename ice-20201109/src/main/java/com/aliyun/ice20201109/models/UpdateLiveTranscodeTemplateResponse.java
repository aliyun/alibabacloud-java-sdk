// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveTranscodeTemplateResponseBody body;

    public static UpdateLiveTranscodeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTranscodeTemplateResponse self = new UpdateLiveTranscodeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTranscodeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveTranscodeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveTranscodeTemplateResponse setBody(UpdateLiveTranscodeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveTranscodeTemplateResponseBody getBody() {
        return this.body;
    }

}
