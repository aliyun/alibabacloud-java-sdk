// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveTranscodeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveTranscodeTemplateResponseBody body;

    public static DeleteLiveTranscodeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveTranscodeTemplateResponse self = new DeleteLiveTranscodeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveTranscodeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveTranscodeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveTranscodeTemplateResponse setBody(DeleteLiveTranscodeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveTranscodeTemplateResponseBody getBody() {
        return this.body;
    }

}
