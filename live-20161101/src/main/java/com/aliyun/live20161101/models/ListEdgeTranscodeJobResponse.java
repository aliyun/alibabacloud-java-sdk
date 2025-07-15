// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEdgeTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeTranscodeJobResponseBody body;

    public static ListEdgeTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeTranscodeJobResponse self = new ListEdgeTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeTranscodeJobResponse setBody(ListEdgeTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
