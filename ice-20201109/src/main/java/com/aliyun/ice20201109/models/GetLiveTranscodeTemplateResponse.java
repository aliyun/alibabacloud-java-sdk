// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveTranscodeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLiveTranscodeTemplateResponseBody body;

    public static GetLiveTranscodeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveTranscodeTemplateResponse self = new GetLiveTranscodeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveTranscodeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveTranscodeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveTranscodeTemplateResponse setBody(GetLiveTranscodeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveTranscodeTemplateResponseBody getBody() {
        return this.body;
    }

}
