// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEdgeTranscodeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeTranscodeTemplateResponseBody body;

    public static ListEdgeTranscodeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeTranscodeTemplateResponse self = new ListEdgeTranscodeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeTranscodeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeTranscodeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeTranscodeTemplateResponse setBody(ListEdgeTranscodeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeTranscodeTemplateResponseBody getBody() {
        return this.body;
    }

}
