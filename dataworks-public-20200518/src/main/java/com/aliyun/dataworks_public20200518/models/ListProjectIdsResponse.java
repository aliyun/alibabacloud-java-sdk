// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectIdsResponseBody body;

    public static ListProjectIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectIdsResponse self = new ListProjectIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectIdsResponse setBody(ListProjectIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectIdsResponseBody getBody() {
        return this.body;
    }

}
