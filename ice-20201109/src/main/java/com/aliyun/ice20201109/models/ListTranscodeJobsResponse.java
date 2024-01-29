// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTranscodeJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTranscodeJobsResponseBody body;

    public static ListTranscodeJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeJobsResponse self = new ListTranscodeJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListTranscodeJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTranscodeJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTranscodeJobsResponse setBody(ListTranscodeJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTranscodeJobsResponseBody getBody() {
        return this.body;
    }

}
