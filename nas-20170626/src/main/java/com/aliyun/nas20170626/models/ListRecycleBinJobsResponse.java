// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycleBinJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecycleBinJobsResponseBody body;

    public static ListRecycleBinJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecycleBinJobsResponse self = new ListRecycleBinJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecycleBinJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecycleBinJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecycleBinJobsResponse setBody(ListRecycleBinJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecycleBinJobsResponseBody getBody() {
        return this.body;
    }

}
