// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEdgeTranscodeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeTranscodeTemplateResponseBody body;

    public static GetEdgeTranscodeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeTranscodeTemplateResponse self = new GetEdgeTranscodeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeTranscodeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeTranscodeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeTranscodeTemplateResponse setBody(GetEdgeTranscodeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeTranscodeTemplateResponseBody getBody() {
        return this.body;
    }

}
