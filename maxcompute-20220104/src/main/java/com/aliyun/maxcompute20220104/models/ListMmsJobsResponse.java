// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmsJobsResponseBody body;

    public static ListMmsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmsJobsResponse self = new ListMmsJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListMmsJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmsJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmsJobsResponse setBody(ListMmsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmsJobsResponseBody getBody() {
        return this.body;
    }

}
