// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobInfosResponseBody body;

    public static ListJobInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfosResponse self = new ListJobInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListJobInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobInfosResponse setBody(ListJobInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobInfosResponseBody getBody() {
        return this.body;
    }

}
