// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPackageJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPackageJobsResponseBody body;

    public static ListPackageJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPackageJobsResponse self = new ListPackageJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListPackageJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPackageJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPackageJobsResponse setBody(ListPackageJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPackageJobsResponseBody getBody() {
        return this.body;
    }

}
