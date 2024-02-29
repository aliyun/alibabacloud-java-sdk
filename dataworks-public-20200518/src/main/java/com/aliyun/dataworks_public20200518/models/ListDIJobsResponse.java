// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDIJobsResponseBody body;

    public static ListDIJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobsResponse self = new ListDIJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListDIJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDIJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDIJobsResponse setBody(ListDIJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDIJobsResponseBody getBody() {
        return this.body;
    }

}
