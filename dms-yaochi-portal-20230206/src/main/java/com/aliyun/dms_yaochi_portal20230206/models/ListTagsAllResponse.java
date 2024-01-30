// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class ListTagsAllResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagsAllResponseBody body;

    public static ListTagsAllResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagsAllResponse self = new ListTagsAllResponse();
        return TeaModel.build(map, self);
    }

    public ListTagsAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagsAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagsAllResponse setBody(ListTagsAllResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagsAllResponseBody getBody() {
        return this.body;
    }

}
