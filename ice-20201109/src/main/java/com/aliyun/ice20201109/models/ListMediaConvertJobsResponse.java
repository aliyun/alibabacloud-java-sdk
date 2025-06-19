// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaConvertJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaConvertJobsResponseBody body;

    public static ListMediaConvertJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaConvertJobsResponse self = new ListMediaConvertJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaConvertJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaConvertJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaConvertJobsResponse setBody(ListMediaConvertJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaConvertJobsResponseBody getBody() {
        return this.body;
    }

}
