// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveRecordJobsResponseBody body;

    public static ListLiveRecordJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordJobsResponse self = new ListLiveRecordJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRecordJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveRecordJobsResponse setBody(ListLiveRecordJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRecordJobsResponseBody getBody() {
        return this.body;
    }

}
