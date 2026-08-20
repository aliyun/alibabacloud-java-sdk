// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProhibitedTagsResponseBody body;

    public static ListProhibitedTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedTagsResponse self = new ListProhibitedTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListProhibitedTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProhibitedTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProhibitedTagsResponse setBody(ListProhibitedTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProhibitedTagsResponseBody getBody() {
        return this.body;
    }

}
