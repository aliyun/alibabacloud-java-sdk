// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomizedVoiceJobsResponseBody body;

    public static ListCustomizedVoiceJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoiceJobsResponse self = new ListCustomizedVoiceJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoiceJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomizedVoiceJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomizedVoiceJobsResponse setBody(ListCustomizedVoiceJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomizedVoiceJobsResponseBody getBody() {
        return this.body;
    }

}
