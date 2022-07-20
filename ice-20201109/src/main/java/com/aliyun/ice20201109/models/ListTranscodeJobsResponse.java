// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTranscodeJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
