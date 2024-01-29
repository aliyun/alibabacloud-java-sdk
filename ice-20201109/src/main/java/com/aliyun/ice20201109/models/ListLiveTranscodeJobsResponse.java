// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveTranscodeJobsResponseBody body;

    public static ListLiveTranscodeJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTranscodeJobsResponse self = new ListLiveTranscodeJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveTranscodeJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveTranscodeJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveTranscodeJobsResponse setBody(ListLiveTranscodeJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveTranscodeJobsResponseBody getBody() {
        return this.body;
    }

}
