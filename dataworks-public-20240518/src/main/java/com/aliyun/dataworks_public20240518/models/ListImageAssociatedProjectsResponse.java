// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImageAssociatedProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageAssociatedProjectsResponseBody body;

    public static ListImageAssociatedProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageAssociatedProjectsResponse self = new ListImageAssociatedProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListImageAssociatedProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageAssociatedProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageAssociatedProjectsResponse setBody(ListImageAssociatedProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageAssociatedProjectsResponseBody getBody() {
        return this.body;
    }

}
