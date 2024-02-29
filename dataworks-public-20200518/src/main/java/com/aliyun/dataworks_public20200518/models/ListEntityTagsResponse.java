// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEntityTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEntityTagsResponseBody body;

    public static ListEntityTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntityTagsResponse self = new ListEntityTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListEntityTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEntityTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEntityTagsResponse setBody(ListEntityTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEntityTagsResponseBody getBody() {
        return this.body;
    }

}
