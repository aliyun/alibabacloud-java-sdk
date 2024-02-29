// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileTypeResponseBody body;

    public static ListFileTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileTypeResponse self = new ListFileTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListFileTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileTypeResponse setBody(ListFileTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileTypeResponseBody getBody() {
        return this.body;
    }

}
