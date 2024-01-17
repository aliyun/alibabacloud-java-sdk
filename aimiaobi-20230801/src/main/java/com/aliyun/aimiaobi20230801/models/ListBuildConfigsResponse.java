// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListBuildConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBuildConfigsResponseBody body;

    public static ListBuildConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBuildConfigsResponse self = new ListBuildConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListBuildConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBuildConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBuildConfigsResponse setBody(ListBuildConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBuildConfigsResponseBody getBody() {
        return this.body;
    }

}
