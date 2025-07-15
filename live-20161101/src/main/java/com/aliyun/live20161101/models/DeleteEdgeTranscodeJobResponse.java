// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteEdgeTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEdgeTranscodeJobResponseBody body;

    public static DeleteEdgeTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeTranscodeJobResponse self = new DeleteEdgeTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEdgeTranscodeJobResponse setBody(DeleteEdgeTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
