// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListTagsForPrivateAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagsForPrivateAccessApplicationResponseBody body;

    public static ListTagsForPrivateAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagsForPrivateAccessApplicationResponse self = new ListTagsForPrivateAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListTagsForPrivateAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagsForPrivateAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagsForPrivateAccessApplicationResponse setBody(ListTagsForPrivateAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagsForPrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
