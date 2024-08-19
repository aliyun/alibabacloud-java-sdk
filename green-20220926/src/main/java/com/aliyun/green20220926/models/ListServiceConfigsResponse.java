// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListServiceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceConfigsResponseBody body;

    public static ListServiceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConfigsResponse self = new ListServiceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceConfigsResponse setBody(ListServiceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceConfigsResponseBody getBody() {
        return this.body;
    }

}
