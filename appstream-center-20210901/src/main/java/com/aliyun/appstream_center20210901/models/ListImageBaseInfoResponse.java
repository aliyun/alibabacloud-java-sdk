// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageBaseInfoResponseBody body;

    public static ListImageBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageBaseInfoResponse self = new ListImageBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListImageBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageBaseInfoResponse setBody(ListImageBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageBaseInfoResponseBody getBody() {
        return this.body;
    }

}
