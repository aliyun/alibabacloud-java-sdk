// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ListFineTuneJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFineTuneJobsResponseBody body;

    public static ListFineTuneJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFineTuneJobsResponse self = new ListFineTuneJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListFineTuneJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFineTuneJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFineTuneJobsResponse setBody(ListFineTuneJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFineTuneJobsResponseBody getBody() {
        return this.body;
    }

}
