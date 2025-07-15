// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateEdgeTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeTranscodeJobResponseBody body;

    public static CreateEdgeTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeTranscodeJobResponse self = new CreateEdgeTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeTranscodeJobResponse setBody(CreateEdgeTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
