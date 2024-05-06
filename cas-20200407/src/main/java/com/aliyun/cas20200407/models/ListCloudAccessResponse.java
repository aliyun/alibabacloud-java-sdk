// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAccessResponseBody body;

    public static ListCloudAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccessResponse self = new ListCloudAccessResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAccessResponse setBody(ListCloudAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAccessResponseBody getBody() {
        return this.body;
    }

}
