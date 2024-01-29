// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAllPublicMediaTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllPublicMediaTagsResponseBody body;

    public static ListAllPublicMediaTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllPublicMediaTagsResponse self = new ListAllPublicMediaTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListAllPublicMediaTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllPublicMediaTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllPublicMediaTagsResponse setBody(ListAllPublicMediaTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllPublicMediaTagsResponseBody getBody() {
        return this.body;
    }

}
