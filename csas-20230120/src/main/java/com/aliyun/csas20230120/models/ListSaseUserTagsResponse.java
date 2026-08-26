// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSaseUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSaseUserTagsResponseBody body;

    public static ListSaseUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSaseUserTagsResponse self = new ListSaseUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListSaseUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSaseUserTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSaseUserTagsResponse setBody(ListSaseUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSaseUserTagsResponseBody getBody() {
        return this.body;
    }

}
