// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSmartJobsResponseBody body;

    public static ListSmartJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmartJobsResponse self = new ListSmartJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSmartJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmartJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSmartJobsResponse setBody(ListSmartJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmartJobsResponseBody getBody() {
        return this.body;
    }

}
