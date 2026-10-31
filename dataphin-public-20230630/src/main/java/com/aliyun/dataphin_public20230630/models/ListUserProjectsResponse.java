// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListUserProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserProjectsResponseBody body;

    public static ListUserProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserProjectsResponse self = new ListUserProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserProjectsResponse setBody(ListUserProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserProjectsResponseBody getBody() {
        return this.body;
    }

}
