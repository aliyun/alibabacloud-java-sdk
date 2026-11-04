// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListPhoneTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPhoneTagsResponseBody body;

    public static ListPhoneTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneTagsResponse self = new ListPhoneTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListPhoneTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhoneTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPhoneTagsResponse setBody(ListPhoneTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhoneTagsResponseBody getBody() {
        return this.body;
    }

}
