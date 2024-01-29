// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDynamicImageJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDynamicImageJobsResponseBody body;

    public static ListDynamicImageJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicImageJobsResponse self = new ListDynamicImageJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListDynamicImageJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDynamicImageJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDynamicImageJobsResponse setBody(ListDynamicImageJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDynamicImageJobsResponseBody getBody() {
        return this.body;
    }

}
